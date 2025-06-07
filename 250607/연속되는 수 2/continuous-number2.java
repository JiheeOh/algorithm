import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<Integer> countList = new ArrayList<>();
    private static int[] arr;
    private static int count = 0 ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for ( int i = 0 ; i < n ; i ++){
            int input = Integer.parseInt(br.readLine());

            if( i ==0 ||  input == arr[i-1]){
                count +=1 ;
                arr[i] = input ;
            }else {
                countList.add(count);
                arr[i] = input;
                count = 1;
            }

        }
        System.out.println(Collections.max(countList));

    }
}
