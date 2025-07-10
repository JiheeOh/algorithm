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

        String[] arr = new String[100001];
        int maxStatus = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int status = Integer.parseInt(st.nextToken());
            arr[status] = st.nextToken();
            if (status > maxStatus) {
                maxStatus = status;
            }
        }

        // 2개씩 빼서 계산
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - k - 1; i++) {
            int score = 0;
            if (i > maxStatus) {
                break;
            }
            for (int j = 0; j < k + 1; j++) {
                if (arr[i + j] == null) {
                    continue;
                }
                switch (arr[i + j]) {
                    case "G":
                        score++;
                        break;
                    case "H":
                        score = score + 2;
                        break;
                }
            }
            if (score > result) {
                result = score;
            }
        }
        System.out.println(result);
    }

}
