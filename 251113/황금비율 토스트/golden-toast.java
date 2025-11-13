

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int breadCnt = Integer.parseInt(st.nextToken());
        int commandCnt = Integer.parseInt(st.nextToken());

        LinkedList<String> breadList = new LinkedList<>();
        String[] data = br.readLine().split("");
        for (int i = 0; i < breadCnt; i++) {
            breadList.add(data[i]);
        }

        ListIterator<String> iterator = breadList.listIterator(breadCnt);
        for (int i = 0; i < commandCnt; i++) {
            StringTokenizer commandData = new StringTokenizer(br.readLine());
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