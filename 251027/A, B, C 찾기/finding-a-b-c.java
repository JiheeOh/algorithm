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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 오름차순 정렬
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[6] - (a + b);

        System.out.printf("%d %d %d", a, b, c);
    }

}