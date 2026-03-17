

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        // 가로
        for (int i = 0; i < n; i++) {
            List<Integer> tmp = new ArrayList<>();
            int duplicnt = 0;
            for (int j = 0; j < n; j++) {
                if (tmp.contains(arr[i][j])) {
                    duplicnt++;
                }else {
                    tmp.add(arr[i][j]);
                }

            }
            if (duplicnt >= m-1) {
                answer++;
            }
        }

        // 세로
        for (int i = 0; i < n; i++) {
            List<Integer> tmp = new ArrayList<>();
            int duplicnt = 0;
            for (int j = 0; j < n; j++) {
                if (tmp.contains(arr[i][j])) {
                    duplicnt++;
                }else {
                    tmp.add(arr[i][j]);
                }

            }
            if (duplicnt >= m-1) {
                answer++;
            }
        }

        System.out.println(answer);

    }

}


