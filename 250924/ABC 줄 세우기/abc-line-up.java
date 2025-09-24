import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] data = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = st.nextToken();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(data[j].charAt(0) >data[j+1].charAt(0)){
                    String tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}