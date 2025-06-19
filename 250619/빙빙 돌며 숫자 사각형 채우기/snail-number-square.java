import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, +1, 0, -1};

    private static int[][] arr;

    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        int dirNum = 0;
        int row = 0;
        int column = 0;
        int data =1;
        int count = n*m;
        while (count-->0) {
            if (isInArr(row, column) && arr[row][column] == 0) {
                arr[row][column] = data;
                data++;
            }
            int expectedRow = row+dy[dirNum];
            int expectedColumn =column+dx[dirNum];
            if(!isInArr(expectedRow,expectedColumn) || arr[expectedRow][expectedColumn] !=0){
                dirNum = (dirNum+1)%4;
            }

            row = row+dy[dirNum];
            column = column+dx[dirNum];
        }

        for(int i = 0 ; i< n ; i ++){
            for(int j = 0 ; j <m;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean isInArr(int row, int column) {
        return row >= 0 && row <= n - 1 && column >= 0 && column <= m - 1;
    }
}
