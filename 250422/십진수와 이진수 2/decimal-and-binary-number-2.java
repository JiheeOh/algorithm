import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] data = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        int result = 0;
        for(int i =0 ; i < data.length;i ++){
            result += Character.getNumericValue(data[i])*Math.pow(2,data.length-1-i);
        }

        result = result * 17;

        while(result >=2) {
            stack.push(result % 2);
            result = result/2;
        }
        stack.push(result);

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        System.out.println(sb);
        
    }
}