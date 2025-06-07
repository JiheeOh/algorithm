import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        int temp = 0;
        int count = 0;
        for ( int i = 0 ; i < n ; i ++){
            int input = Integer.parseInt(br.readLine());
            arr[i] = input ;

            if( i ==0 || input * arr[i-1] > 0){
                count ++ ;
            }else {
                count = 1;
            }
           temp = Math.max(temp,count);
        }
        System.out.println(temp);

    }
}
