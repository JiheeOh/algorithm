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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2*n];

        for (int i = 0; i < 2*n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 오름차순 정렬
        Arrays.sort(arr);

        int[] front = new int[n];
        int[] back = new int[n];

        // 2. 반절 나누기
        for (int i = 0; i < 2*n; i++) {
            if (i < n ) {
                front[i] = arr[i];
            } else {
                back[i - n ] = arr[i];
            }
        }

        // 3. 그룹내 차가 최솟값인 것 구하기
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n ; i++) {
            min = Math.min(back[i] - front[i], min);
        }

        System.out.println(min);
    }

}