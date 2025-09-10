import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr= new int[101];
        for (int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j = start; j<end+1;j++){
                arr[j] +=1;
            }
        }

        String answer = "No";
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==n){
               answer = "Yes";
               break;
            }
        }
        System.out.println(answer);
    }


}
