
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int bangMax = 0;
        int bombNm = 0;
        for (int i = 0; i < n - 1; i++) {
            int bangCnt = 0;
            for (int j = 1; j < k + 1; j++) {
                if (i + j >= n) {
                    break;
                }
                if (arr[i] == arr[i + j]) {
                    bangCnt++;
                }
            }
                
            if (bangCnt > bangMax) {
                bangMax = bangCnt;
                bombNm = arr[i];
            }
        }
        System.out.println(bombNm);
    }


}
