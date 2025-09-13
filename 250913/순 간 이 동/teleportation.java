import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 1. 바로 a-b로 가는 경우
        int result = Math.abs(a-b);

        //2. x -> y ->b
        result = Math.min(Math.abs(a-x)+Math.abs(b-y),result);

        //3. y -> x -> a
        result = Math.min(Math.abs(a-y)+Math.abs(b-x),result);

        System.out.println(result);


    }




}
