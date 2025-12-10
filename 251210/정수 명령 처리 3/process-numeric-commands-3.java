

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n;i++){
            String command = scanner.next();
            switch (command){
                case "push_front":
                    int data =scanner.nextInt();
                    deque.addFirst(data);
                    break;

                case "push_back":
                    int data1 =scanner.nextInt();
                    deque.addLast(data1);
                    break;

                case "pop_front":
                    System.out.println(deque.pollFirst());
                    break;

                case "pop_back":
                    System.out.println(deque.pollLast());
                    break;

                case "size":
                    System.out.println(deque.size());
                    break;

                case "empty":
                    if(deque.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    System.out.println(deque.peekFirst());
                    break;
                case "back":
                    System.out.println(deque.peekLast());
                    break;
            }
        }



    }


}


