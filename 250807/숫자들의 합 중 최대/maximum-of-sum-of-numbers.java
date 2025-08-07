
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x =Integer.parseInt(st.nextToken());
        int y =Integer.parseInt(st.nextToken());

        int result = Integer.MIN_VALUE;
        for(int i =x ; i<y+1; i++){
            String[] digit =Integer.toString(i).split("");
            int count = 0 ;
            for (int j = 0 ; j<digit.length;j++){
                count += Integer.parseInt(digit[j]);
            }
            result = Math.max(result,count);
        }
        System.out.println(result);
    }
}
