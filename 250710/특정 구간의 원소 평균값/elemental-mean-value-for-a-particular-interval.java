
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // 데이터 찾기
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <=j ; k++){
                    sum +=arr[k];
                }
                double avg = (double) sum / (j-i+1);

                for(int p =i; p<=j;p++){
                    if(arr[p] == avg){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);


    }

}
