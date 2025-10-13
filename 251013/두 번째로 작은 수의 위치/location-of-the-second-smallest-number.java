import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortData);

        int answerValue = -1;
        for (int i = 1; i < n; i++) {
            if (i < n-1 && sortData[i] != sortData[i - 1] && sortData[i] != sortData[i + 1]) {
                answerValue = sortData[i];
                break;
            } else if (i ==n-1 && sortData[i] != sortData[i - 1]) {
                answerValue = sortData[i];
                break;
            }
        }

        if (n == 2) {
            if (sortData[1] != sortData[0]) {
                answerValue = sortData[1];
            }
        }

        if (answerValue == -1) {
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            if (data[i] == answerValue) {
                System.out.println(i + 1);
                break;
            }
        }


    }
}