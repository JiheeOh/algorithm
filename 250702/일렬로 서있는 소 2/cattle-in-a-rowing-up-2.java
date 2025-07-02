
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> input = new ArrayList<>();
        for(int i = 0 ; i< 5; i ++){
            input.add(Integer.parseInt(st.nextToken()));
        }


        int result = 0;
        for (int i = 0; i < input.size(); i++) {
            for (int j = i+1; j < input.size(); j++) {
               for(int k = j+1 ; k<input.size() ; k++){
                   if(input.get(i) <= input.get(j) && input.get(j)<= input.get(k)){
                       result ++;
                   }
               }
            }

        }
        System.out.println(result);
    }


}
