import java.util.*;
import java.io.*;

public class Main {

    public static int MAX = 100000;
    public static int currentPoint = 100000;

    public static int[] arr = new int[2 * MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 이동
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int moveCnt = Integer.parseInt(st.nextToken());
            String moveDirection = st.nextToken();

            if (moveDirection.equals("R")) {
                while (moveCnt-- > 0) {
                    arr[currentPoint] = 1;
                    if (moveCnt != 0) {
                        currentPoint++;
                    }
                }
            } else {
                while (moveCnt-- > 0) {
                    arr[currentPoint] = 2;
                    if (moveCnt != 0) {
                        currentPoint--;
                    }
                }
            }

        }

        // 색깔 찾기
        int black = 0;
        int white = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                black++;
            } else if (arr[i] == 2) {
                white++;
            }
        }

        System.out.printf("%d %d", white, black);
    }
}
