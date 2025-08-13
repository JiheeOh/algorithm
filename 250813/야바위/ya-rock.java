import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        // 데이터 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구슬 찾기
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            boolean[] cups = new boolean[3];
            cups[i] = true;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int leftIndex = arr[j][0]-1;
                int rightIndex = arr[j][1]-1;
                int findIndex = arr[j][2]-1;
                boolean tmp = cups[leftIndex];
                cups[leftIndex] = cups[rightIndex];
                cups[rightIndex] = tmp;

                if(cups[findIndex]){
                    cnt++;
                }
            }
            result = Math.max(result,cnt);
        }


        System.out.println(result);
    }


}
