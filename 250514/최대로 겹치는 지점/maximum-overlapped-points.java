import java.util.*;
import java.io.*;

public class Main {

    public static int[] arr = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for( int j = start; j <=end; j++){
                arr[j] = arr[j]+1;
            }
        }
        
        System.out.println(Arrays.stream(arr).max().getAsInt());


    }
}