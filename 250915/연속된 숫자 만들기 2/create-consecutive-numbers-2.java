import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        // 1. 이미 연속일 경우
        if (arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1) {
        } else if (arr[1] - arr[0] == 2 || arr[2] - arr[1] == 2) { //2. 하나만 옮기면 될 경우
            result = 1;

        } else { // 나머지는 2번
            result = 2;
        }

        System.out.println(result);


    }


}
