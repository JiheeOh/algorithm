import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] originArr;
    private static int n;
    private static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        originArr = new int[n];

        st = new StringTokenizer(br.readLine());
        int maxData = 0;
        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());
            originArr[i] = data;
            maxData = Math.max(data, maxData);
        }

        int minData = Math.max(originArr[0],originArr[n-1] );

        int result = 101;
        for (int i = maxData; i >= minData; i--) {
            if (isPossible(i)) {
                result = Math.min(result, i);
            }
        }

        System.out.println(result);

    }

    private static boolean isPossible(int x) {
        List<Integer> possibleArr = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (originArr[i] <= x) {
                possibleArr.add(i);
                cnt++;
            }
        }

        if (possibleArr.size() == 1 && possibleArr.get(0) > k) {
            return false;
        }
        for (int j = 0; j < cnt - 1; j++) {
            if (possibleArr.get(j + 1) - possibleArr.get(j) > k) {
                return false;
            }
        }
        return true;
    }
}
