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
        int[] notReadList = new int[m];
        String[] data = new String[m];
        for (int i = 0; i < n; i++) {
            people.add(String.valueOf((char) (i + 65)));
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            int notRead = Integer.parseInt(st.nextToken());
            notReadList[i] =notRead;
            if (i == p - 1 && notRead == 0) {
                people = new ArrayList<>();
                break;
            }
            data[i] = person;
            if (i >= p - 1) {
                if(notReadList[i] == notReadList[i-1]){
                    people.remove(data[i-1]);
                }
                people.remove(person);
            }
        }

        for(String person : people){
            System.out.print(person+" ");
        }

    }


}
