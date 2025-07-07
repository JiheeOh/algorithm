import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int result = Integer.MIN_VALUE;
        for(int j = 0; j< n-2; j++){
            for(int k = j+2; k<n;k++){
                int plus = arr[j]+arr[k];
                if(plus>result){
                    result = plus;
                }
            }

        }
        System.out.println(result);

    }

}
