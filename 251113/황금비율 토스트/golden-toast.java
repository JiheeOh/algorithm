

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int breadCnt = sc.nextInt();
        int commandCnt = sc.nextInt();
        String s = sc.next();
        sc.nextLine();
        
        LinkedList<String> breadList = new LinkedList<>();
        String[] data = s.split("");
        for (int i = 0; i < breadCnt; i++) {
            breadList.add(data[i]);
        }

        ListIterator<String> iterator = breadList.listIterator(breadCnt);
        for (int i = 0; i < commandCnt; i++) {
            StringTokenizer commandData = new StringTokenizer(sc.nextLine());
            String command = commandData.nextToken();

            switch (command){
                case "L":
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    break;
                case "P":
                    String breadData = commandData.nextToken();
                    iterator.add(breadData);
                    break;
                case "R":
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    break;
                case "D":
                    if(iterator.hasNext()){
                        iterator.next();
                        iterator.remove();
                    }
                    break;
            }
        }

        for(int i = 0; i <breadList.size();i++){
            System.out.print(breadList.get(i));
        }
    }
}