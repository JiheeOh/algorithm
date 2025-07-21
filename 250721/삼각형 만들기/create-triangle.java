

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] x;
    private static int[] y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        x = new int[n];
        y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (x[i] == x[j] && x[i] == x[k]) {
                        continue;
                    }
                    if (y[i] == y[j] && y[i] == y[k]) {
                        continue;
                    }
                    if (x[i] == x[j] && y[i] == y[j]) {
                        continue;
                    }
                    if (x[j] == x[k] && y[j] == y[k]) {
                        continue;
                    }
                    if (x[k] == x[i] && y[k] == y[i]) {
                        continue;
                    }

                    int width = isTrue(x[i], x[j], x[k], y[i], y[j], y[k]);
                    if(width>result){
                        result =width;
                    }

                }
            }
        }
        System.out.println(result);

    }


    private static int isTrue(int x1, int x2, int x3, int y1, int y2, int y3) {
        if (y1 == y2) {
            if (x2 == x3) {
                return Math.abs(x2 - x1) * Math.abs(y3 - y2);
            } else if (x1 == x3) {
                return Math.abs(x2 - x1) * Math.abs(y3 - y1);
            }
        } else if (y2 == y3) {
            if (x1 == x2) {
                return Math.abs(x2 - x3) * Math.abs(y1 - y2);
            } else if (x1 == x3) {
                return Math.abs(x2 - x3) * Math.abs(y3 - y1);
            }
        } else if (y1 == y3) {
            if (x1 == x2) {
                return Math.abs(x1 - x3) * Math.abs(y1 - y2);
            } else if (x2 == x3) {
                return Math.abs(x1 - x3) * Math.abs(y3 - y2);
            }

        }
        return 0;
    }
}

