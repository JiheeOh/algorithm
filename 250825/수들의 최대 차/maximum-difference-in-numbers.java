import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int min = -1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min) {
                min = arr[i];
            } else {
                continue;
            }
            int max = min + k;
            int j = i;
            int cnt = 0;
            while (j < n && arr[j] <= max) {
                cnt++;
                j++;
            }
            result = Math.max(cnt, result);
        }

        System.out.println(result);

    }
}
