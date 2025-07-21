import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum1 = arr[i] + arr[j];
                for (int k = 0; k < n - 1; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    for (int q = k + 1; q < n; q++) {
                        if (q == i || q == j) {
                            continue;
                        }
                        int sum2 = arr[k] + arr[q];
                        int sum3 = Math.abs(totalSum - (sum1 + sum2));
                        if( sum1 == sum2 || sum2==sum3 || sum1 ==sum3){
                        }else {
                            int[] numbers = {sum1, sum2, sum3};
                            int maxSum = Arrays.stream(numbers).max().getAsInt();
                            int minSum = Arrays.stream(numbers).min().getAsInt();
                            int sumDiff = maxSum - minSum;
                            if (minDiff > sumDiff) {
                                minDiff = sumDiff;
                            }
                        }

                    }
                }
            }
        }
        if(minDiff == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(minDiff);
        }
    }
}