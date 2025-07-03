
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");


        boolean isChanged = false;
        for( int i = 0 ; i<arr.length; i ++){
            if(isChanged){
                break;
            }
            if(Integer.parseInt(arr[i]) ==0){
                arr[i] = String.valueOf(1);
                isChanged = true;
            }
        }
        if(!isChanged){
            arr[arr.length-1]=  String.valueOf(0);
        }
        int result=0;
        for ( int i =0; i <arr.length;i++){
            result += (int) (Integer.parseInt(arr[i])*Math.pow(2,arr.length-i-1));
        }
        System.out.println(result);
    }


}
