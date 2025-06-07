import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        arr = new int[n];

        int temp = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i ++){
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input ;

            if( i > 1 && input > arr[i-1] && input > t ){
                count ++ ;
            }else if(input > t){
                count = 1;
            }else {
                count =0;
            }
           temp = Math.max(temp,count);
        }
        System.out.println(temp);

    }
}
