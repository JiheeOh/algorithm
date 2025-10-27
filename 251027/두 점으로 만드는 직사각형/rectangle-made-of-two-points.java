import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        // Please write your code here.

        int x = Math.min(x1,a1);
        int y = Math.min(y1,b1);
        int a = Math.max(x2,a2);
        int b = Math.max(y2,b2);
        
        int col = Math.abs(a-x);
        int row = Math.abs(b-y);
        System.out.println(col*row);
    }
}