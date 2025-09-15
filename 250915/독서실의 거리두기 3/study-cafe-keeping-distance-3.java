import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");
        List<Integer> seat = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                seat.add(i);
            }
        }

        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < seat.size() - 1; i++) {
            int interval = seat.get(i + 1) - seat.get(i);
            if (interval == 1) {
                tmp = 1;
                break;
            }
            tmp = Math.max(tmp, interval);
        }

        if (tmp == 1) {
            System.out.println(tmp);
        } else {
            System.out.println(tmp / 2);
        }


    }


}
