import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int min = 10001;
        int max = -1;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
        }

        int result = 0;
        if (max - min > 17) {
            int tmp = max-17-min;
            result = (tmp/2 *tmp/2)+(tmp-tmp/2)*(tmp-tmp/2);
        }
        System.out.println(result);
    }


}
