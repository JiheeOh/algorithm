import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int equalsCnt = 0;
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
            if (i > 0 && data[i] == data[i - 1]) {
                equalsCnt++;
            }
        }

        if (equalsCnt == n - 1) {
            System.out.println(-1);
            System.exit(0);
        }

        int min = Integer.MAX_VALUE;
        int tmp = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] < min) {
                tmp =min;
                min = data[i];
            }else if(data[i]==min){
                continue;
            } else{
                if(data[i]<tmp){
                    tmp = data[i];
                    answer = i+1;
                }else if(data[i] == tmp){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        System.out.println(answer);
    }
}