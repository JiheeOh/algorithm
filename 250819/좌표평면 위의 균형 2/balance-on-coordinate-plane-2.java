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

            maxX = Math.max(maxX, tmpX);
            maxY = Math.max(maxY, tmpY);
        }

        int result = Integer.MAX_VALUE;
        for (int i = 2; i <= maxX; i += 2) {
            for (int j = 2; j <= maxY; j += 2) {

                int[] dotCnt = new int[4];
                // 1사분면
                int count1 = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] > i && y[k] > j) {
                        count1++;
                    }
                }
                dotCnt[0] = count1;
                // 2사분면
                int count2 = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] < i && y[k] > j) {
                        count2++;
                    }
                }
                dotCnt[1] = count2;

                // 3사분면
                int count3 = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] < i && y[k] < j) {
                        count3++;
                    }
                }
                dotCnt[2] = count3;

                // 4사분면
                int count4 = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] > i && y[k] < j) {
                        count4++;
                    }
                }
                dotCnt[3] = count4;

                int maxDotCnt = Arrays.stream(dotCnt).max().getAsInt();
                result = Math.min(maxDotCnt,result);
            }
        }

        System.out.println(result);
    }


}
