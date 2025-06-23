import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int cnt = 0;
        int x = 0;
        int y = 0;
        String[] data = input.split("");

        int result = -1;
        int dirNum = 0;
        for (String move : data) {
            switch (move) {
                case "R":
                    dirNum = (dirNum + 1) % 4;
                    break;
                case "L":
                    dirNum = (dirNum + 3) % 4;
                    break;
                case "F":
                    x = x + dx[dirNum];
                    y = y + dy[dirNum];
                    break;

            }
            cnt++;
            if (x == 0 && y == 0) {
                result = cnt;
            }

        }
        System.out.println(result);
    }

}
