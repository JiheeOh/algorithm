import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int moveCnt = Integer.parseInt(st.nextToken());
            switch (direction) {
                case "W":
                    x = x+dx[0]*moveCnt;
                    y = y+dy[0]*moveCnt;
                    break;
                case "S":
                    x = x+dx[1]*moveCnt;
                    y = y+dy[1]*moveCnt;
                    break;
                case "N":
                    x = x+dx[2]*moveCnt;
                    y = y+dy[2]*moveCnt;
                    break;
                case "E":
                    x = x+dx[3]*moveCnt;
                    y = y+dy[3]*moveCnt;
                    break;

            }

        }
            System.out.printf("%d %d",x,y);
    }
}
