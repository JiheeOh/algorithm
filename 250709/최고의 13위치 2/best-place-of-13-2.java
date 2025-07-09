
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[][] arr;

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 값 찾기
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = i + 1; k < n; k++) {
                    for (int p = 0; p < n - 2; p++) {
                        int count = arr[i][j] + arr[i][j+1] +arr[i][j+2]+arr[k][p]+arr[k][p+1]+arr[k][p+2];
                        if( count > result){
                            result = count;

                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

}
