import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int budget = Integer.parseInt(st.nextToken());

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] finalPrice = Arrays.copyOf(price, price.length);
            finalPrice[i] = finalPrice[i] / 2;
            Arrays.sort(finalPrice);

           int count = 0;
           int tempBudget = budget;
            for (int j = 0; j < n; j++) {
                if(tempBudget-finalPrice[j] >= 0){
                    count++;
                    tempBudget = tempBudget-finalPrice[j];
                }
            }
            result = Math.max(count,result);
        }
        System.out.println(result);
    }
}
