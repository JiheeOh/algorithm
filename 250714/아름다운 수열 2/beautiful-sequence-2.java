import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        List<Integer> bList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            bList.add(Integer.parseInt(st.nextToken()));
        }


        // 데이터 찾기
        int count =0;
        for (int i = 0; i < n-m+1; i++) {
            HashSet<Integer> compareData = new HashSet<>();
            for(int j = 0; j< m;j++){
                compareData.add(arr[i+j]);
            }

            if(compareData.containsAll(bList)){
                count++;
            }


        }
        System.out.println(count);


    }

}
