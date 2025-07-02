
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j< arr.length-2; j ++){
                int plus = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                if( plus > result ){
                    result = plus;
                }
            }

        }
        System.out.println(result);
    }


}
