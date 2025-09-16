

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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (Math.abs(b - a) == 1 && Math.abs(c - b) == 1) {
            System.out.println(0);
            System.exit(0);
        }


        int x =Math.abs(b - a);
        int y = Math.abs(c - b);

        int max = Math.max(x,y);

        System.out.println(max-1);


    }
}
