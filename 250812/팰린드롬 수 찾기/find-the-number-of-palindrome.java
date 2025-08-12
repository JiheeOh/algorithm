


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = start; i < end + 1; i++) {
            String[] tmp = Integer.toString(i).split("");
            Stack<String> stack = new Stack<>();
            stack.addAll(Arrays.asList(tmp));

            boolean isAnswer = true;
            for (int j = 0; j < tmp.length; j++) {
                if (!stack.pop().equals(tmp[j])) {
                    isAnswer = false;
                    break;
                }
            }
            if (isAnswer) {
                result++;
            }

        }


        System.out.println(result);
    }


}
