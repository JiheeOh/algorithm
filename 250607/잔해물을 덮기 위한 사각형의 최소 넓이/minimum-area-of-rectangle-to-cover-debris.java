
import java.util.*;
import java.io.*;

public class Main {

    public static int OFFSET = 1000;

    public static int[][] arr = new int[2 * OFFSET + 1][2 * OFFSET + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 색칠하기
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;


            for (int j = x1; j < x2; j++) {
                for (int p = y1; p < y2; p++) {
                    // 색칠하기
                    arr[j][p] = i + 1;
                }
            }
        }

        int x1 = -1;
        int x2  = -1;
        int y1  = -1 ;
        int y2 = -1 ;

        // 1인 애들 중 최소 꼭지점 구하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    x1 = i;
                    y1 = j;
                    break;
                }
            }
            // 최소점 찾으면 끝
            if(x1 != -1){
                break;
            }
        }
        // 최대 점 찾기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    if( x2 < i){
                        x2 = i;
                    }
                   if(y2 < j){
                       y2 = j;
                   }
                }
            }
        }

        System.out.println( (x2-x1+1)*(y2-y1+1));

    }
}
