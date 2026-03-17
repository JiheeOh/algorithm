

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
        if (m == 1) {
            System.out.println(2 * n);
            System.exit(0);
        }

        // 가로
        for (int i = 0; i < n; i++) {
            int duplicnt = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j + 1] == arr[i][j]) {
                    duplicnt++;
                    if (duplicnt >= m - 1) {
                        answer++;
                        break;
                    }
                } else {
                    duplicnt = 0;
                }

            }

        }

        // 세로
        for (int i = 0; i < n; i++) {
            int duplicnt = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j][i] == arr[j + 1][i]) {
                    duplicnt++;
                    if (duplicnt >= m - 1) {
                        answer++;
                        break;
                    }
                } else {
                    duplicnt = 0;
                }
            }
        }

        System.out.println(answer);

    }

}


