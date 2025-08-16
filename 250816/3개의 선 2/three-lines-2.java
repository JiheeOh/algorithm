import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmpX = Integer.parseInt(st.nextToken());
            int tmpY = Integer.parseInt(st.nextToken());
            x[i] = tmpX;
            y[i] = tmpY;
            maxX = Math.max(tmpX, maxX);
            maxY = Math.max(tmpY, maxY);
        }

        int[][] arr = new int[maxX+1][maxY+1];
        for (int i = 0; i < n; i++) {
            arr[x[i]][y[i]] = 1;
        }

        int result = 0;
        // 1. y축 평행 선 쭉 찾기
        int lineCnt = 0;
        for (int i = 0; i < maxX+1; i++) {
            boolean need = false;
            for (int j = 0; j < maxY+1; j++) {
                if (arr[i][j] == 1) {
                    need = true;
                    break;
                }
            }
            if (need) {
                lineCnt++;
            }
        }

        for (int j = 0; j < maxY+1; j++) {
            int cnt = 0;
            for (int i = 0; i < maxX+1; i++) {
                if (arr[i][j] == 1 && cnt >= 1) {
                    lineCnt--;
                    break;
                } else if (arr[i][j] == 1 && cnt == 0) {
                    cnt++;
                }
            }
        }

        if (lineCnt <= 3) {
            result = 1;
        }

        System.out.println(result);
    }


}
