
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_back":
                    tmp.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    tmp.remove(tmp.size()-1);
                    break;
                case "size":
                    System.out.println(tmp.size());
                    break;
                case "get":
                    System.out.println(tmp.get(Integer.parseInt(st.nextToken())-1));
                    break;
            }
        }


    }
}