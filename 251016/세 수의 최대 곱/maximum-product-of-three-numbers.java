import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순
        Arrays.sort(arr);
        int lastIndex = n - 1;

        int first3= arr[lastIndex] * arr[lastIndex - 1] * arr[lastIndex - 2];
        // 1. 다 음수이거나 양수일 경우는 그냥 상위 3개 곱한게 제일 크다
        if (arr[lastIndex] <= 0 || arr[0] >= 0) {
            System.out.println(first3);
            System.exit(0);
        }

        // 2. 음수, 양수 섞여 있을 때
        // 2.1 양수 3개 곱 최대
        int first1last2 = arr[lastIndex]* arr[1]*arr[0];

        System.out.println(Math.max(first3,first1last2));



    }

}