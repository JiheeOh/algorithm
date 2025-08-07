import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    private static int[] Ta;
    private static int[] Tb;

    private static int c;
    private static int g;
    private static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        Ta = new int[n];
        Tb = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Ta[i] = Integer.parseInt(st.nextToken());
            Tb[i] = Integer.parseInt(st.nextToken());
        }

        int min = Arrays.stream(Ta).min().getAsInt();
        int max = Arrays.stream(Tb).max().getAsInt();

        int result = Integer.MIN_VALUE;
        for (int i = min-1; i < max + 1; i++) {
            int output = getOutput(i);
            result = Math.max(result, output);
        }

        System.out.println(result);
    }

    private static int getOutput(int degree) {
        int output = 0;
        for (int i = 0; i < Ta.length; i++) {
            if (degree < Ta[i]) {
                output += c;
            } else if (Ta[i] <= degree && degree <= Tb[i]) {
                output += g;
            } else if (Tb[i] < degree) {
                output += h;
            }
        }
        return output;
    }


}
