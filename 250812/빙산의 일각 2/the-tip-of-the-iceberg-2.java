import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int[] data = new int[n];

        int maxData = 0;
        int minData = 10001;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            data[i] = tmp;
            maxData = Math.max(tmp,maxData);
            minData = Math.min(tmp,minData);
        }

        int result = 0;

        for(int i = minData ; i< maxData ; i++){
            int count = 0;
            boolean show =false;
            for (int j = 0; j < data.length; j++) {
               if(data[j] >i && !show){
                   show=true;
                   count++;<
               }else if(data[j] <= i){
                   show = false;
               }
            }
            result = Math.max(result,count);
        }


        System.out.println(result);
    }


}
