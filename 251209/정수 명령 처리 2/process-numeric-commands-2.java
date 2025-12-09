

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            switch (command) {
                case "push":
                    String data = scanner.next();
                    queue.add(data);
                    break;

                case "pop":
                    System.out.println(queue.poll());
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    System.out.println(queue.peek());
                    break;

            }


        }


    }


}
