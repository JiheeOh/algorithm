import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        

        // 오름차순 정렬
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int first = arr.get(0);
            int end = arr.get(n - 1);

            if (first < end ) {
                arr.add(n - 1, first);
                arr.remove(0);
                cnt++;
            } else if (end < first) {
                arr.add(first);
                arr.remove(0);
                cnt++;
            }

           
        }

        System.out.println(cnt-1);
    }

}