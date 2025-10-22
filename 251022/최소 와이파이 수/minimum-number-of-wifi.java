import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] data = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        int[] wifi = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean isWifi = false;
            if (data[i] != 0) {
                int tmp = i + m;
                while (tmp >= i - m) {
                    if (tmp >= 0 && tmp < n && wifi[tmp] == 1) {
                        isWifi = true;
                    }
                    tmp--;
                }
            }
            if (!isWifi && data[i] != 0) {
                wifi[i+m] = 1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}