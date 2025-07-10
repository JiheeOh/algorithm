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
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());
            arr[i] = data;
            totalSum += data;
        }

        // 2개씩 빼서 계산
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = totalSum-(arr[i]+arr[j]);
                int comp = Math.abs(s-sum);
                if(comp<result){
                    result = comp;
                }
            }
        }
        System.out.println(result);
    }

}
