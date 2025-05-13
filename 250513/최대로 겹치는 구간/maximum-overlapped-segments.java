import java.util.*;
import java.lang.*;
public class Main {

    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        
        // minus -> plus 
        int min1 = Arrays.stream(x1).min().getAsInt();
        int min2 = Arrays.stream(x2).min().getAsInt();

        int offset = 0;
        if (min1 <= min2) {
            offset = Math.abs(min1);
        }else {
            offset = Math.abs(min2);
        }

        
        for (int i = 0; i < n; i++) {
           x1[i] = x1[i] +offset;
           x2[i] = x2[i] +offset;
        }

        int max1 = Arrays.stream(x1).max().getAsInt();
        int max2 = Arrays.stream(x2).max().getAsInt();

        int max = 0;
        if (max1 <= max2) {
            max = max2;
        }else {
            max = max1;
        }

        arr= new int[max];
        
        for (int i =0; i < n; i ++){
            for(int j= x1[i]; j< x2[i]; j++){
                arr[j] = arr[j]+1;
            }
        }
      

        // find max
        System.out.println(Arrays.stream(arr).max().getAsInt());

    }
}