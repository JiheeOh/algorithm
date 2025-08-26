import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] data = br.readLine().toCharArray();

        List<Integer> seat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (data[i] == '1') {
                seat.add(i);
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] != '0' || data[j] != '0') {
                    continue;
                }
                List<Integer> seatTmp = new ArrayList<>(seat);
                seatTmp.add(i);
                seatTmp.add(j);
                Collections.sort(seatTmp);
                int distance = Integer.MAX_VALUE;
                for (int k = 0; k < seatTmp.size()-1; k++) {
                    int tmp = seatTmp.get(k + 1) - seatTmp.get(k);
                    distance = Math.min(distance, tmp);
                }
                result = Math.max(result, distance);
            }
        }
        System.out.println(result);
    }


}
