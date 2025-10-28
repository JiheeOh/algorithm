import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] front = new int[n];
        int[] back = new int[n];
        for( int i = 0 ; i< n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            front[i] = Integer.parseInt(st.nextToken());
            back[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(front);
        Arrays.sort(back);

        int minLength = Math.min(back[n-1]-front[1],back[n-2]-front[0]);
        System.out.println(minLength);
    }
}