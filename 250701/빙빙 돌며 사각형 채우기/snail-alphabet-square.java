
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {1, 0, -1, 0}; // 오른쪽, 아래, 왼쪽, 위
    private static int[] dy = {0, 1, 0, -1};
    private static char[][] arr;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];


        int row = 0;
        int column =0;
        int dirNum = 0;
        int ascii = 65;
        arr[0][0] = (char)ascii;

        int loopCnt = (n*m)-1;
        while(loopCnt >0){
            int expectedRow = row + dy[dirNum%4];
            int expectedColumn = column + dx[dirNum%4];
            if(isInArr(expectedRow,expectedColumn) && arr[expectedRow][expectedColumn] == 0){
                if(ascii >90){
                    ascii = 64;
                }
                ascii++;
                arr[expectedRow][expectedColumn] = (char)ascii;
                row = expectedRow;
                column = expectedColumn;
                loopCnt--;
            }else {
                dirNum++;
            }
        }

    for (int i = 0; i<n; i++){
        for(int j=0; j <m ; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }

    public static boolean isInArr(int row,int column){
        return 0<= row && row<n && 0<=column && column<m;
    }

}
