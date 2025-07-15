


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] A = new int[3];
    private static int[] B = new int[3];

    private static int n ;

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (isTrue(A[0],i) && isTrue(A[1],j)&& isTrue(A[2],k))
                            {
                        cnt++;
                        continue;
                    }
                    if (isTrue(B[0],i) && isTrue(B[1],j)&& isTrue(B[2],k))
                    {
                        cnt++;
                    }

                }
            }
        }
        System.out.println(cnt);

    }

    private static boolean isTrue(int arrData, int compareData) {
        boolean result =false;
        if(Math.abs(compareData - arrData) <= 2 ){
            result =true;
        }else if (arrData == 1){
            if(compareData ==n || compareData == n-1){
                result =true;
            }
        }else if (arrData ==2){
            if(compareData == n){
                result =true;
            }
        }
        return result;

    }
}
