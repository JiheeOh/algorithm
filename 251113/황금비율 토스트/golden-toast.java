
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

        LinkedList<Character> breadList = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            breadList.add(s.charAt(i));
        }


        ListIterator<Character> iterator = breadList.listIterator(breadCnt);
        for (int i = 0; i < commandCnt; i++) {
            char command = sc.next().charAt(0);

            switch (command){
                case 'L':
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    break;
                case 'P':
                    char breadData = sc.next().charAt(0);
                    iterator.add(breadData);
                    break;
                case 'R':
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    break;
                case 'D':
                    if(iterator.hasNext()){
                        iterator.next();
                        iterator.remove();
                    }
                    break;
            }
        }

        iterator = breadList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}