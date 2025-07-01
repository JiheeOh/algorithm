


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dx = {1, 0, -1, 0}; // 오른쪽, 아래, 왼쪽, 위
    private static int[] dy = {0, -1, 0, 1};
    private static int[][] arr;
    private static int n;
    private static int allowRange = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];


        int row = n / 2;
        int column = n / 2;
        int dirNum = 0;
        int cnt = 1;
        arr[row][column] = cnt;

        int loopCnt = (n * n) - 1;
        while (loopCnt > 0) {
            int expectedRow = row + dy[dirNum % 4];
            int expectedColumn = column + dx[dirNum % 4];
            if (isInArr(expectedRow, expectedColumn) && isInRange(expectedRow, expectedColumn) && arr[expectedRow][expectedColumn] == 0) {
                cnt++;
                arr[expectedRow][expectedColumn] = cnt;
                row = expectedRow;
                column = expectedColumn;
                loopCnt--;

            } else if (isInArr(expectedRow, expectedColumn) && arr[expectedRow][expectedColumn] != 0) {
                dirNum--;
                allowRange++;
            } else {
                dirNum++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isInArr(int row, int column) {
        return 0 <= row && row < n && 0 <= column && column < n;
    }

    public static boolean isInRange(int row, int column) {
        return n / 2 - allowRange <= row && row <= n / 2 + allowRange && n / 2 - allowRange <= column && column <= n / 2 + allowRange;
    }

}
