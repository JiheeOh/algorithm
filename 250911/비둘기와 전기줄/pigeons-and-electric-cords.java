import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[101];
        int result = 0 ;
        for(int i= 0; i<n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bird = Integer.parseInt(st.nextToken());
            String status = st.nextToken();

            if(arr[bird] !=null && !Objects.equals(arr[bird], status)){
                arr[bird] = status;
                result++;
            }else if(!Objects.equals(arr[bird], status)){
                arr[bird] = status;
            }
        }

        System.out.println(result);
    }


}
