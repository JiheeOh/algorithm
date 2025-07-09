


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx ={-1,1,0,0,1,1,-1,-1}; // 왼,오,위,아래,오위,오아래,왼위,왼아래
    private static int[] dy ={0,0,-1,1,-1,1,-1,1};
    private static String[][] arr;

    private static int n;
    private static int m;


    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.split("")[j];
            }
        }

        // 찾기
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j].equals("L")){
                    result += findAnswer(i,j);
                }
            }
        }
        System.out.println(result);
    }

    private static int findAnswer(int i, int j) {
        int result =0;

        for(int p =0; p< dx.length ; p++){
            int row = i;
            int column = j;

            int cnt = 0;
            int loopCnt = 2;
            while(loopCnt >0){
                int expectedRow = row + dy[p];
                int expectedColumn = column+dx[p];

                if(isInArr(expectedRow,expectedColumn) && arr[expectedRow][expectedColumn].equals("E")){
                    row = expectedRow;
                    column = expectedColumn;
                    cnt++;
                }
                loopCnt--;
            }
            if(cnt ==2){
                result++;
            }
        }

        return result;
    }

    private static boolean isInArr(int expectedRow, int expectedColumn) {
        return 0 <= expectedRow && expectedRow < n &&  0 <= expectedColumn && expectedColumn < m;
    }
}
