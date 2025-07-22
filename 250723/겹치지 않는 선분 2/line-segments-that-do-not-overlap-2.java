

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] x1;
    private static int[] x2;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        x1 = new int[n];
        x2 = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                // 안겹칠때
                if (x1[i] <= x1[j] && x2[i] <= x2[j] && x1[j] < x2[j]) {
                } else if (x1[j] >= x1[i] && x2[j] >= x2[i] && x2[i] > x1[i]) {
                } else if (x1[j] <= x1[i] && x2[j] <= x2[i] && x1[i] < x2[i]) {
                } else if (x1[i] >= x1[j] && x2[i] >= x2[j] && x2[j] > x1[j]) {
                } else { //겹칠때
                    duplicate = true;
                }
            }
            if (!duplicate) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
