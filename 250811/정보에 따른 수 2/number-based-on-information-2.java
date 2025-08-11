import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        List<Integer> S = new ArrayList<>();
        List<Integer> N = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String dot = st.nextToken();
            int status = Integer.parseInt(st.nextToken());
            switch (dot){
                case "S" :
                    S.add(status);
                    break;
                case "N" :
                    N.add(status);
                    break;
            }
        }

        // 오름차순 정렬
        Collections.sort(S);
        Collections.sort(N);

        int result = 0;
        for (int i = start; i < end + 1; i++) {
            int[] tmpS = new int[S.size()];
            int[] tmpN = new int[N.size()];

            for(int j = 0 ; j < tmpS.length; j++){
                tmpS[j] = Math.abs(i-S.get(j));
            }
            Arrays.sort(tmpS);

            for(int k = 0 ; k < tmpN.length; k++){
                tmpN[k] = Math.abs(i-N.get(k));
            }

            Arrays.sort(tmpS);
            Arrays.sort(tmpN);

            if(tmpS[0] <=tmpN[0]){
                result++;
            }
        }
        System.out.println(result);
    }


}
