import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<Integer> first = new ArrayList<>();
    private static List<Integer> second = new ArrayList<>();

    private static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int data1 = Integer.parseInt(st.nextToken());
            int data2 = Integer.parseInt(st.nextToken());
            if (data1 != data2) {
                first.add(data1);
                second.add(data2);
            }
        }

        length = first.size();
        int result = Integer.MIN_VALUE;

        // 1. 가위 2.바위 3.보
        result = Math.max(result, getWinner(2,3,1));

        // 1. 가위 2.보 3.바위
        result = Math.max(result, getWinner(3,1,2));

        System.out.println(result);

    }

    private static int getWinner( int second1,  int second2,  int second3) {
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            int data1 = first.get(i);
            int data2 = second.get(i);
            if (data1 == 1 && data2 == second1
                    || data1 == 2 && data2 == second2
                    || data1 == 3 && data2 == second3) {
                cnt++;
            }
        }
        return cnt;
    }


}
