import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] arr;
    private static int n = 15;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        boolean findAnswer = false;
        while (true) {
            findAnswer = fourLoops();
            if (findAnswer) {
                break;
            }
        }


    }

    private static boolean fourLoops() {
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int q = k + 1; q < n; q++) {
                        int a = arr[i];
                        int b = arr[j];
                        int c = arr[k];
                        int d = arr[q];

                        // 1. 4개 합
                        if (arr[n - 1] != a + b + c + d) {
                            continue;
                        }
                        int[] tmpArr = {a, b, c, d, a + b, b + c, c + d, d + a, a + c, b + d, a + b + c, a + b + d, a + c + d, b + c + d, a + b + c + d};
                        Arrays.sort(tmpArr);
                        if (Arrays.equals(tmpArr, arr)) {
                            System.out.printf("%d %d %d %d", a, b, c, d);
                            return true;
                        }

                    }

                }

            }
        }
        return false;
    }
}
