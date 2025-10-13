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
            if (sortData[i] != sortData[i - 1]) {
                answerValue = sortData[i];
                break;
            }
        }

        if (answerValue == -1) {
            System.out.println(-1);
            System.exit(0);
        }

        boolean findAnswer = false;
        int answer = -1;
        for (int i = 0; i < n; i++) {
            if (data[i] == answerValue && !findAnswer) {
                answer = i + 1;
                findAnswer = true;
            } else if (data[i] == answerValue && findAnswer) {
                answer = -1;
            }

        }
        System.out.println(answer);
    }
}