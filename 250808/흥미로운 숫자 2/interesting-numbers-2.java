import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = x; i < y + 1; i++) {
            List<Integer> data = new ArrayList<>();
            int tmp = i;
            while (tmp > 0) {
                int leftOver = tmp % 10;
                if (!data.contains(leftOver)) {
                    data.add(leftOver);
                }
                tmp = tmp/10;
            }
            if(data.size() ==2){
                result ++;
            }

        }
        System.out.println(result);
    }


}
