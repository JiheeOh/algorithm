
import java.io.*;
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
        int[] sign = new int[n];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i ++){
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input ;

            if( i > 0 && input > arr[i-1] && input > t){
                count ++;
            }else {
                count =0;
            }
            temp = Math.max(temp,count);
        }
        System.out.println(temp);

    }
}
