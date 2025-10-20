import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            sum += tmp;
        }

        int toBe = sum / n;

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > toBe) {
                answer += arr[i] - toBe;
            }
        }

        System.out.println(answer);
    }

}