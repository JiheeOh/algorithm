import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {1, 0, 0, -1};
    private static int[] dy = {0, -1, 1, 0};

    private static int[][] arr;

    private static int n ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        st= new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken())-1;
        int column = Integer.parseInt(st.nextToken())-1;
        String direction = st.nextToken();

        int dirNum = 0 ;
        switch (direction){
            case "R":
                dirNum = 0;
                break;
            case "U":
                dirNum = 1;
                break;
            case "D":
                dirNum = 2;
                break;
            case "L":
                dirNum = 3;
                break;
        }


        while(t-->0){
           if(isInArr(row+dy[dirNum]) && isInArr(column + dx[dirNum])){
            row = row + dy[dirNum];
            column = column + dx[dirNum];
           }else{
               dirNum = 3-dirNum;
           }
        }

        System.out.printf("%d %d",row+1,column+1);
    }

    public static boolean isInArr(int status) {
        return status >=0 && status <=n-1;
    }
}
