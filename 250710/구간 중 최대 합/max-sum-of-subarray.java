
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());
            arr[i] = data;
        }

        // 2개씩 빼서 계산
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n -k+ 1; i++) {
            int sum =0;
            for(int j = 0; j<k;j++){
                sum += arr[i+j];
            }
            if (sum > result) {
                result = sum;
            }
        }
        System.out.println(result);
    }

}
