


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] xR = {0, 0, -1, 1}; // 북,남,서,동
    private static int[] yR = {-1, 1, 0, 0};

    private static int[] xL = {0, 0, 1, -1}; // 북,남,동,서
    private static int[] yL = {-1, 1, 0, 0};

    private static String[][] arr;
    private static int n;

    private static String direction;

    private static int row;
    private static int colmn;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new String[n][n];

        // arr 생성
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = input[j];
            }
        }

        int k = Integer.parseInt(br.readLine()) - 1;
        getDirectionRowColmn(k);

        int cnt = 0;
        int dirNum = findDirNum(arr[row][colmn], direction);
        while (isInArr(row, colmn)) {
            cnt++;
            if (arr[row][colmn].equals("\\")) {
                row = row + yL[(dirNum + 2) % 4];
                colmn = colmn + xL[(dirNum + 2) % 4];
                dirNum = findDirNum(dirNum+2);

            } else {
                row = row + yR[(dirNum + 2) % 4];
                colmn = colmn + xR[(dirNum + 2) % 4];
                dirNum = findDirNum(dirNum+2);
            }
        }
        System.out.println(cnt);

    }

    private static int findDirNum(String data, String direction) {
        int dirNum = 0;
        if (data.equals("\\")) {
            switch (direction) {
                case "N" :
                    dirNum = 0;
                    break;
                case "S" :
                    dirNum = 1;
                    break;
                case "W" :
                    dirNum = 2;
                    break;
                case "E" :
                    dirNum = 3;
                    break;
            }
        } else {
            switch (direction) {
                case "N" :
                    dirNum = 0;
                    break;
                case "S" :
                    dirNum = 1;
                    break;
                case "E" :
                    dirNum = 2;
                    break;
                case "W" :
                    dirNum = 3;
                    break;
            };

        }
        return dirNum;
    }
    private static int findDirNum(int dirNum) {
        if(dirNum %2 ==0){
            dirNum =dirNum +1;

        }else {
            dirNum =dirNum-1;
        }

        return dirNum;
    }
    public static boolean isInArr(int row, int colmn) {
        return 0 <= row && row <= n - 1 && 0 <= colmn && colmn <= n - 1;
    }

    public static void getDirectionRowColmn(int k) {
        if (k / n <= 1) {
            direction = "N";
            row = 0;
            colmn = k % n;
        } else if (k / n > 1 && k / n <= 2) {
            direction = "E";
            row = n - k % n;
            colmn = n;
        } else if (k / n > 2 && k / n <= 3) {
            direction = "S";
            row = n;
            colmn = n - k % n;
        } else if (k / n > 3 && k / n <= 4) {
            direction = "W";
            row = k % n;
            colmn = 0;
        }
    }


}
