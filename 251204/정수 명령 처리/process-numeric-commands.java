

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandCnt = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < commandCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int data = Integer.parseInt(st.nextToken());
                    stack.push(data);
                    break;

                case "empty":
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;

                case "pop":
                    System.out.println(stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "top":
                    System.out.println(stack.peek());
                    break;


            }

        }


    }


}
