import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        List<Integer> possibleA = new ArrayList<>();
        List<Integer> possibleB = new ArrayList<>();

        int nA = 0;
        int nB = 0;

        while (a * nA <= c) {
            possibleA.add(a * nA);
            nA++;
        }
        while (b * nB <= c) {
            possibleB.add(b * nB);
            nB++;
        }

        // 1. 1개 골라서 2배
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < possibleA.size(); i++) {
            for (int j = 0; j < possibleB.size(); j++) {
                int value = possibleA.get(i) + possibleB.get(j);
                if (value <= c) {
                    result = Math.max(result, value);
                }
            }
        }
        System.out.println(result);
    }


}
