import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        arr = new int[n];

        int plusTemp = 0;
        int minusTemp = 0;
        int plusCount = 0;
        int minusCount = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input;



            if (i > 0 && input > arr[i - 1] && input > t) {
                plusCount++;
            } else if (i > 0 && input < arr[i - 1] && input > t) {
                minusCount++;
            } else {
                plusCount = 0;
                minusCount = 1;
            }
            plusTemp = Math.max(plusTemp, plusCount);
            minusTemp = Math.max(minusTemp, minusCount);
        }
        System.out.println(Math.max(plusTemp, minusTemp));

    }
}
