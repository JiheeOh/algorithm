

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int budget = Integer.parseInt(st.nextToken());

        int[] price = new int[n];
        int[] shipment = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            price[i] = Integer.parseInt(st.nextToken());
            shipment[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int total = price[i] / 2 + shipment[i];
            int cnt = 1 ;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int calculate = price[j] + shipment[j];
                if( calculate+total <= budget){
                    total += calculate;
                    cnt++;
                }
            }
            result = Math.max(result,cnt);
        }


        System.out.println(result);
    }
}
