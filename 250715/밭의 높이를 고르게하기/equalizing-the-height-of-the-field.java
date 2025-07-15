import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // 밭 균일 비용 계산
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n - t + 1; i++) {
            int cost = 0;
            for (int j = 0; j < t; j++) {
                cost += Math.abs(h - arr[i + j]);
            }
            if (cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println(minCost);
    }
}
