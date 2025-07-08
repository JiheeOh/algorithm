


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    private static int n = 19;
    private static int[][] arr = new int[n][n];

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int data = Integer.parseInt(st.nextToken());
                if (data != 0) {
                    arr[i][j] = data;
                }
            }
        }

        // 이기는 지 확인
        boolean win = false;
        int result = 0;
        int row = 0;
        int column =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 5; j++) {
                // 가로 확인
                if (arr[i][j] != 0 && arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i][j + 2]
                        && arr[i][j] == arr[i][j + 3] && arr[i][j] == arr[i][j + 4]) {
                    win = true;
                    result = arr[i][j];
                    row = i+1;
                    column = j+3;

                    break;
                }
                // 세로 확인
                if (arr[j][i] != 0 && arr[j][i] == arr[j + 1][i] && arr[j][i] == arr[j + 2][i]
                        && arr[j][i] == arr[j + 3][i] && arr[j][i] == arr[j + 4][i]) {
                    win = true;
                    result = arr[j][i];
                    row = j+3;
                    column = i+1;
                    break;
                }

            }
            if (win) {
                break;
            }
        }
        if (!win) {
            // 오른쪽 대각선
            for (int i = 0; i < n - 5; i++) {
                if (arr[i][i] != 0 && arr[i][i] == arr[i + 1][i + 1] && arr[i][i] == arr[i + 2][i + 2]
                        && arr[i][i] == arr[i + 3][i + 3] && arr[i][i] == arr[i + 4][i + 4]) {
                    win = true;
                    result = arr[i][i];
                    row = i+3;
                    column = i+3;
                    break;
                }
            }
            //왼쪽 대각선
            for (int i = n-1; i > 3; i--) {
                for(int j = 0; j<n-5;j++){
                    if (arr[i][j] != 0 && arr[i][j] == arr[i -1][j + 1] && arr[i][j] == arr[i - 2][j +2]
                            && arr[i][j] == arr[i - 3][j + 3] && arr[i][j] == arr[i - 4][j + 4]) {
                        win = true;
                        result = arr[i][j];
                        row = i-1;
                        column = j+3;
                        break;
                    }
                }

            }
        }
        System.out.println(result);
        if(result!=0){
            System.out.println(String.format("%d %d",row,column));
        }
    }

}
