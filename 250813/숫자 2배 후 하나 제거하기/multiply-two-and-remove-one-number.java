import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 데이터 입력
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 1개 골라서 2배
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int[] arr2 = Arrays.copyOf(arr,arr.length);
            arr2[i] = 2*arr2[i];
            for (int j = 0; j < n; j++) { // 1개 골라서 제외
                int diff = 0;
                int[] tmp = new int[n - 1];
                int index = 0 ;
                for (int k = 0; k < n; k++) {
                    if (j == k) {
                        continue;
                    }
                    tmp[index] = arr2[k];
                    index++;
                }
                for(int p=0 ; p< n-2 ; p++){
                    diff += Math.abs(tmp[p+1]-tmp[p]);
                }
                result = Math.min(result,diff);
            }

        }
        System.out.println(result);
    }


}
