import java.util.*;
import java.io.*;

public class Main {

    public static int OFFSET = 1000;

    public static int[][] arr = new int[2 * OFFSET + 1][2 * OFFSET + 1];

    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;


            for (int j = x1; j < x2; j++) {
                for (int p = y1; p < y2; p++) {
                    // 색칠하기
                    arr[j][p] = 1;
                    answer += 1;
                }
            }

        }
        st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

        for (int j = x1; j < x2; j++) {
            for (int p = y1; p < y2; p++) {
                // 색칠하기
                if(arr[j][p]==1){
                    arr[j][p] = 0;
                    answer -= 1;
                }

            }
        }

        System.out.println(answer);
    }
}
