import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr= new int[15];
        for(int i = 0 ; i<15 ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = 0;
        int d = 0;
        for(int i = 2; i <15 ;i++){
            if(arr[i] <= a+b && arr[14]-(a+b+arr[i]) >= arr[i]){
                c = arr[i];
                d = arr[14]-(a+b+c);
                break;
            }
        }

        System.out.printf("%d %d %d %d",a,b,c,d);
    }
}