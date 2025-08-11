import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = x; i < y + 1; i++) {
           String[] tmp = Integer.toString(i).split("");
           int[] arr= new int[10];
           int cnt = 0;
           for(int j = 0 ; j<tmp.length;j++){
               if(arr[Integer.parseInt(tmp[j])]==0){
                   arr[Integer.parseInt(tmp[j])] =1;
               }
           }

           for( int k = 0 ; k <arr.length;k++){
               if(arr[k] !=0){
                   cnt++;
               }
           }
           if(cnt ==2){
               result++;
           }


        }
        System.out.println(result);
    }


}
