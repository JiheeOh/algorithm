
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 사람 수 입력
        List<Integer> people = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            people.add(Integer.parseInt(st.nextToken()));
        }

        int minDistance = Integer.MAX_VALUE ;
        for(int i = 0 ; i<n ; i ++){
            int distanceCount = 0 ;
            for(int j =0 ; j<n ; j++){
                distanceCount += Math.abs(j-i)*people.get(j);
            }
            if ( distanceCount < minDistance){
                minDistance = distanceCount;
            }
        }

        System.out.println(minDistance);
    }


}
