


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static int A[] = new int[100001];
    private static int B[] = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // A 이동
        int appendHour = 1;
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());

            for (int j = appendHour; j < hour + appendHour; j++) {
                A[j] = speed + A[j - 1];
            }
            appendHour = appendHour + hour;
        }

        // B 이동
        appendHour = 1;
        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());

            for (int j = appendHour; j < hour + appendHour; j++) {
                B[j] = speed + B[j - 1];

            }
            appendHour = appendHour + hour;
        }

        Stack<String> winner = new Stack<>();
        winner.push("start");
        for ( int i = 1 ; i <A.length ; i ++){
            if ( A[i] > B[i] && !winner.peek().equals("A")){
                winner.push("A");
            } else if (B[i] > A[i] && !winner.peek().equals("B")) {
                winner.push("B");
            }
        }
        System.out.println(winner.size()-2);
    }
}
