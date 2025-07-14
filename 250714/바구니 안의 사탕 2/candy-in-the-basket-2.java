
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            int status = Integer.parseInt(st.nextToken());
            arr[status] = arr[status]+data;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i - k;
            if (start < 0) {
                start = 0;
            }
            int end = i + k;
            if (end > 100) {
                end = 100;
            }
            int sum = 0;
            for (int j = start; j < end + 1; j++) {
                sum += arr[j];
            }

            if (sum > max) {
                max = sum;
            }

        }
        System.out.println(max);
    }

}
