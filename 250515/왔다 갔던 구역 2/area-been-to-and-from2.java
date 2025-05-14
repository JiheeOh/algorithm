
import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;
    public static int initPoint;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int offset = n * 10;
        arr = new int[n * 10+offset];
        initPoint = 0 + offset;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int move = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();


            if (direction.equals("R")) {
                int count = 0;
                for (int j = initPoint; j < initPoint + move; j++) {
                    arr[j] = arr[j] + 1;
                    count++;
                }
                initPoint = initPoint+count;

            } else if (direction.equals("L")) {
                int count = 0;
                for (int j = initPoint-1 ; j >= initPoint - move; j--) {
                    arr[j] = arr[j] + 1;
                    count++;
                }
                initPoint = initPoint-count;
            }

        }

        int result = 0;
        for(int q = 0; q < arr.length; q++) {
            if (arr[q] >= 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}
