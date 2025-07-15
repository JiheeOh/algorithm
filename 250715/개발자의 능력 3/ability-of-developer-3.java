import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] arr = new int[6];

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalSum = 0;
        for (int i = 0; i < 6; i++) {
            int data = Integer.parseInt(st.nextToken());
            arr[i] = data;
            totalSum += data;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int sum1 = arr[i]+arr[j]+arr[k];
                    int sum2 = totalSum-sum1;
                    int diff = Math.abs(sum1-sum2);
                    if ( diff < minDiff){
                        minDiff = diff;
                    }
                }
            }
        }
        System.out.println(minDiff);

    }
}
