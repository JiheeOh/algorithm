


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data = br.readLine();
        int dirNum = 3;
        int x = 0;
        int y = 0;

        for (String move : data.split("")) {
            switch (move) {
                case "R":
                    dirNum = (dirNum+1)%4;
                    break;
                case "L":
                    dirNum = (dirNum-1+4)%4;
                    break;
                case "F":
                    x = x + dx[dirNum];
                    y = y + dy[dirNum];
                    break;
            }
        }
        System.out.printf("%d %d",x,y);
    }
}
