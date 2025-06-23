import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {0, 1, 0, -1}; // 위, 오른쪽 ,아래, 왼쪽
    private static int[] dy = {-1, 0, 1, 0};

    private static int[][] arr;
    private static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int colmn = Integer.parseInt(st.nextToken());

            int dirNum = 0;
            arr[row][colmn] = 1;
            int cnt = 0 ;
            for (int j = 0; j < 4; j++) {
                int moveRow = row + dy[dirNum];
                int moveColmn = colmn +dx[dirNum];
                if (isInArr(moveRow, moveColmn) && arr[moveRow][moveColmn] == 1) {
                    cnt++;
                }
                dirNum++;
            }
            if (cnt ==3){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }

    public static boolean isInArr(int row,int colmn){
        return 1<= row && row <=n && 1<=colmn && colmn<=n;
    }

}
