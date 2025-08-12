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
            int tmp = i ;
            int answer = 0;
            while(tmp>0){
                int dan = String.valueOf(tmp).length()-1;
                answer += (int) ((tmp%10)*Math.pow(10,dan));
                tmp = tmp/10;
            }
            if (answer == i){
                result++;
            }
        }


        System.out.println(result);
    }


}
