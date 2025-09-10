import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        String result = "No";
        for (int i = 0; i < n; i++) {
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;

            int minIndex = 0;
            int maxIndex = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (x[j] > maxX) {
                    maxX = x[j];
                    maxIndex = j;
                }

                if (y[j] < minY) {
                    minY = y[j];
                    minIndex = j;
                }
            }

            if(y[minIndex] >= x[maxIndex]){
                result = "Yes";
                break;
            }
        }

        System.out.println(result);
    }


}
