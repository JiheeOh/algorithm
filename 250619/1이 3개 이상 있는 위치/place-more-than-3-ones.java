


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private static int[][] arr;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        // arr 생성
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dirNum = 3;
                int find = 4;
                int count = 0;

                while (find-- > 0) {
                    int row = i + dy[(dirNum + 1) % 4];
                    int column = j + dx[(dirNum + 1) % 4];
                    if (isInArr(row, column) && arr[row][column] == 1) {
                        count++;
                    }

                    dirNum++;

                }
                if (count >= 3) {
                    result++;
                }
            }

        }
        System.out.println(result);


    }

    public static boolean isInArr(int x, int y) {
        return x >= 0 && x <= n - 1 && y >= 0 && y <= n - 1;
    }
}
