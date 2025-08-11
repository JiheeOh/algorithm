


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = x; i < y + 1; i++) {
            String[] tmp = Integer.toString(i).split("");
            int[] arr = new int[10];

            for (int j = 0; j < tmp.length; j++) {
            
                arr[Integer.parseInt(tmp[j])] += 1;

            }

            int diffCnt = 0;
            boolean isAnswer = false;
            for (int k = 0; k < arr.length; k++) {

                if (arr[k] != 0) {
                    diffCnt++;
                    if (arr[k] == 1) {
                        isAnswer = true;
                    }
                }


            }
            if (diffCnt == 2 && isAnswer) {
                result++;
            }


        }
        System.out.println(result);
    }


}
