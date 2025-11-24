import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<n; i++){
            int key = arr[i];
            int compare = i-1;
            while (compare >=0 && arr[compare] >key){
                arr[compare+1] = arr[compare];
                compare--;
            }
            arr[compare+1] = key;
        }

        for(int i = 0; i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        

    }
}