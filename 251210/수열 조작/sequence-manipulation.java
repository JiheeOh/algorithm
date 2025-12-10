

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.addLast(i + 1);

        }

        while (deque.size()>1){
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }

        System.out.println(deque.poll());

    }


}


