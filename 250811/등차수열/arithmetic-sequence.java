import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] data = new int[n];

        int maxData = 0;
        int minData = 101;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            data[i] = tmp;
            maxData = Math.max(tmp,maxData);
            minData = Math.min(tmp,minData);
        }

        int result = 0;

        for(int i = minData+1 ; i< maxData ; i++){
            int count = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(Math.abs(i-data[j]) == Math.abs(i-data[k])){
                        count++;
                    }
                }
            }
            result = Math.max(result,count);
        }


        System.out.println(result);
    }


}
