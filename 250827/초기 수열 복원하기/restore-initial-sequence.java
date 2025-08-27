import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n - 1];

        if (n == 1) {
            System.out.println(Integer.parseInt(br.readLine()));
            return;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < data[0]; i++) { // 첫번째 값 선택
            List<Integer> answerArr = new ArrayList<>();
            answerArr.add(i);
            for (int j = 1; j < n; j++) {
                int tmp = data[j - 1] - answerArr.get(answerArr.size() - 1);
                if (answerArr.contains(tmp) || tmp ==0) {
                    break;
                } else {
                    answerArr.add(tmp);
                }
            }
            if (answerArr.size() == n) {
                for (int k = 0; k < n; k++) {
                    System.out.print(answerArr.get(k)+" ");
                }
                break;
            }
        }

    }


}
