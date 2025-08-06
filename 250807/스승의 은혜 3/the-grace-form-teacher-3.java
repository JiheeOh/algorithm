


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] price;
    private static int[] shipment;
    private static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int budget = Integer.parseInt(st.nextToken());

        price = new int[n];
        shipment = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            price[i] = Integer.parseInt(st.nextToken());
            shipment[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int leftMoney = budget - (price[i] / 2 + shipment[i]);
            int cnt = 1;

            Queue<Integer> calculate = getOrderCalculate(i);
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if(calculate.peek() ==null){
                    break;
                }
                int pay =  calculate.poll();
                if (leftMoney >= pay ) {
                    leftMoney -= pay;
                    cnt++;
                }else {
                    break;
                }
            }
            result = Math.max(result, cnt);
        }


        System.out.println(result);
    }

    private static Queue<Integer> getOrderCalculate(int i) {
        List<Integer> orderedCalculate = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (i == j) {
                continue;
            }
            orderedCalculate.add(price[j]+shipment[j]);
        }
        Collections.sort(orderedCalculate);

        return new LinkedList<>(orderedCalculate);
    }
}
