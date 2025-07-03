import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int distance = 0 ;
            for (int j = i; j<n+i;j++){
                distance += Math.abs(j-i)*arr[j%n];
            }
            if(distance<minDistance){
                minDistance = distance;
            }
        }
        System.out.println(minDistance);
    }

}
