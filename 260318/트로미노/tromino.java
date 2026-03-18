
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int first = 0;
        int second = 0;

        // 1. 2*2 정사각형 중에 제일 큰 숫자 3개의 합
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                int[] tmpArr = {arr[i][j],arr[i][j+1],arr[i+1][j],arr[i+1][j+1]};
                Arrays.sort(tmpArr);
                int tmp = tmpArr[3]+tmpArr[2]+tmpArr[1];

                first = Math.max(tmp,first);
            }
        }

        // 2. 가로 중 제일 큰 수
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m - 2; j++) {
                int tmp = arr[i][j] + arr[i][j+1]+arr[i][j+2];
                second = Math.max(second,tmp);
            }
        }

        // 2. 세로 중 제일 큰 수
        for (int j = 0; j < m ; j++) {
            for (int i = 0; i < n - 2; i++) {
                int tmp = arr[i][j] + arr[i+1][j]+arr[i+2][j];
                second = Math.max(second,tmp);
            }
        }

        System.out.println(Math.max(first,second));
    }

}


