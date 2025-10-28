

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

        int minLength = Integer.MAX_VALUE;
        for(int i = 0 ; i< n ; i++){
            int a = Integer.MAX_VALUE;
            int b = Integer.MIN_VALUE;

            for(int j = 0; j <n ; j++){
                if(i == j){
                    continue;
                }else{
                    a = Math.min(front[j],a);
                    b = Math.max(back[j],b);
                }
            }

            minLength = Math.min(b-a,minLength);
        }
        System.out.println(minLength);
    }
}