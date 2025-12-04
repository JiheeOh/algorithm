

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        String[] strSplit = str.split("");
        Stack<String> stack = new Stack<>();
        for(String data:strSplit){
            switch (data){
                case "(":
                    stack.push(("("));
                    break;
                    
                case ")":
                    if(stack.isEmpty()){
                        System.out.println("No");
                        System.exit(0);
                    }
                    stack.pop();
                    break;    
                    
            }
        }
        
        if(!stack.isEmpty()){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }


}
