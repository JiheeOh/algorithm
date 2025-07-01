


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int[][] arr;
    private static int n;
    private static int m;
    private static int allowRange = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        String[] commandList = br.readLine().split("");
        for(int i =0; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0 ; j < n ; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int row = n / 2;
        int column = n / 2;
        int dirNum = 0;

        int result = arr[row][column];
        for (String command : commandList){
            switch (command){
                case "R":
                    dirNum = dirNum+1;
                    break;

                case "L":
                    dirNum = dirNum+3;
                    break;

                case "F":
                    if(isInArr(row + dy[dirNum%4],column+ dx[dirNum%4])){
                        row = row + dy[dirNum%4];
                        column = column+ dx[dirNum%4];
                        result += arr[row][column];
                    }
                    break;

            }

        }
        System.out.println(result);

    }

    public static boolean isInArr(int row, int column) {
        return 0 <= row && row < n && 0 <= column && column < n;
    }



}
