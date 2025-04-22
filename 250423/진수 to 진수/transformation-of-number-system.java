import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Please write your code here.

        int result = 0;
        for(int i = 0 ; i< N.length();i++){
            result += Integer.parseInt(N.split("")[i]) * Math.pow(8,N.length()-1-i);
        }

        while(result >=B){
            stack.push(result%B);
            result = result/B;
        }
        stack.push(result);

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}