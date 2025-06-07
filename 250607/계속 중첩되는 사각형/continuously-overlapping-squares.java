import java.util.*;
import java.io.*;

public class Main {

    public static int OFFSET = 100;

    public static int[][] arr = new int[2 * OFFSET + 1][2 * OFFSET + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 색칠하기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            int check = 0;
            // 빨간색 = 1
            if (i % 2 == 0) {
                check = 1;
            } else { // 파란색  =2
                check = 2;
            }

            for (int j = x1; j < x2; j++) {
                for (int p = y1; p < y2; p++) {
                    // 색칠하기
                    arr[j][p] = check;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 2) {
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }
}
