import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {-1, 0, 0, 1};
    private static int[] dy = {0, -1, 1, 0};

    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());

            int dirNum = 0;
            switch (direction) {
                case "W":
                    dirNum = 0;
                    break;
                case "S":
                    dirNum = 1;
                    break;
                case "N":
                    dirNum = 2;
                    break;
                case "E":
                    dirNum = 3;
                    break;
            }
            while (moveCnt-- > 0) {
                x = x + dx[dirNum];
                y = y + dy[dirNum];

                if (x == 0 && y == 0) {
                    System.out.println(cnt);
                    break;
                }
                cnt++;
            }
            if (x == 0 && y == 0) {
                break;
            }
        }
        if (x != 0 && y != 0) {
            System.out.println(-1);

        }
    }

}
