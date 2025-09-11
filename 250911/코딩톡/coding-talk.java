import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        List<String> people = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            people.add(String.valueOf((char) (i + 65)));
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            int notRead = Integer.parseInt(st.nextToken());
            if (i == p - 1 && notRead == 0) {
                people = new ArrayList<>();
            }
            if (i >= p - 1) {
                people.remove(person);
            }
        }

        for(String person : people){
            System.out.print(person+" ");
        }

    }


}
