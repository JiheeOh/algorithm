import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int scoreA = 0;
        int scoreB = 0;
        String winner = "AB";

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(person.equals("A")){
                scoreA += score;
            }else{
                scoreB += score;
            }

            if(scoreA >scoreB && !winner.equals("A")){
                winner = "A";
                cnt++;
            }else if(scoreB > scoreA && !winner.equals("B")){
                winner = "B";
                cnt++;
            }else if ( scoreB ==scoreA && !winner.equals("AB")){
                winner = "AB";
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}