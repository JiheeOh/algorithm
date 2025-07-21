import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n - (n - 2); i++) {
            List<Integer> xCollect = new ArrayList<>();
            List<Integer> yCollect = new ArrayList<>();
            for (int j = 0; j < n - 1; j++) {
                xCollect.add(x[i+j]);
                yCollect.add(y[i+j]);

            }
            int width = (Collections.max(xCollect)-Collections.min(xCollect)) * (Collections.max(yCollect)-Collections.min(yCollect));
            if(result>width){
                result =width;
            }
        }
        System.out.println(result);
    }
}