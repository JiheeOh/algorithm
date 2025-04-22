import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while(n >= b) {
            stack.push(n%b);
            n = n/b;
        }
        stack.push(n);

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}