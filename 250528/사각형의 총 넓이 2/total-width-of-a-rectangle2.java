import java.util.*;
import java.io.*;

public class Main {

    public static int OFFSET = 100;

    public static int[][] arr = new int[2 * OFFSET + 1][2 * OFFSET + 1];

    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 이동
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int p = y1; p < y2; p++) {
                    if (arr[j][p] == 1) {
                        continue;
                    }
                    arr[j][p] = 1;
                    answer ++;
                }
            }
        }
        System.out.println(answer);
    }
}
