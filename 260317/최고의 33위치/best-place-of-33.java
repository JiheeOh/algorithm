

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int tmp = 0;
                tmp += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                tmp += arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                tmp += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                answer = Math.max(answer, tmp);
            }
        }
        System.out.println(answer);

    }

}


