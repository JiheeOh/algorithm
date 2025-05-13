import java.util.*;
public class Main {

    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        arr = new int[N+1];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j= A; j<=B ; j++){
                arr[j] = arr[j]+1;
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println(max);
        
    }
}