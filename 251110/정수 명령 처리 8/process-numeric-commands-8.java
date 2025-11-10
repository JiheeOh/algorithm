

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> answerList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    answerList.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    answerList.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    System.out.println(answerList.pop());
                break;

                case "pop_back":
                    System.out.println(answerList.pollLast());
                    break;

                case "size":
                    System.out.println(answerList.size());
                    break;

                case "empty":
                    if(answerList.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;

                case "front":
                    System.out.println(answerList.peekFirst());
                    break;
                case "back":
                    System.out.println(answerList.peekLast());
                    break;

            }

        }
    }
}