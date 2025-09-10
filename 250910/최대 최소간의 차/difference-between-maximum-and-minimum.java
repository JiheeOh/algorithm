import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최솟값
        int result = Integer.MAX_VALUE ;
        for (int i = 1; i < 10001; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > i + k) {
                    cost += arr[j] - (i + k);
                } else if (arr[j] < i) {
                    cost+= i-arr[j];
                }
            }
            result = Math.min(result, cost);
        }

        System.out.println(result);
    }


}
