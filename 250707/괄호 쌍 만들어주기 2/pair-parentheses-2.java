import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int n = input.length;

        int result =0;
        for(int i = 0; i< n-3; i++) {
            if (input[i] == '(' && input[i + 1] == '(') {
                for (int k = i + 2; k < n - 1; k++) {
                    if (input[k] == ')' && input[k + 1] == ')') {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);

    }

}
