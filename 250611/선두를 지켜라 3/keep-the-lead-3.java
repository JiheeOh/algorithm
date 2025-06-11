

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    private static int[] A = new int[1000001];
    private static int[] B = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<String> winner = new Stack<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // A의 속도
        int appendHourA = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());

            for (int j = appendHourA; j < appendHourA + hour; j++) {
                A[j] = speed + A[j - 1];
            }
            appendHourA += hour;

        }

        // B의 속도
        int appendHourB = 1;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());

            for (int j = appendHourB; j < appendHourB + hour; j++) {
                B[j] = speed + B[j - 1];
            }
            appendHourB += hour;
        }

        // 남은 애들 채워주기
        int maxHour = 0;
        if (appendHourB > appendHourA) {
            maxHour = appendHourA;
            for (int j = appendHourA; j < appendHourB; j++) {
                A[j] = A[j - 1];
            }
        } else {
            maxHour = appendHourB;
            for (int j = appendHourB; j < appendHourA; j++) {
                B[j] = B[j - 1];
            }
        }


        // find winner
        winner.push("start");
        for (int j = 1; j < maxHour; j++) {
            if (A[j] > B[j] && !Objects.equals(winner.peek(), "A")) {
                winner.push("A");
            } else if (B[j] > A[j] && !Objects.equals(winner.peek(), "B")) {
                winner.push("B");
            } else if (B[j] == A[j] && !Objects.equals(winner.peek(), "AB")) {
                winner.push("AB");
            }
        }
        System.out.println(winner.size() - 1);
    }
}
