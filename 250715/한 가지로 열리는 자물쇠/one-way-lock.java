

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] arr;

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<3;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        int cnt = 0 ;
        for(int i = 1 ; i<=n;i++){
            for(int j = 1 ; j<=n; j++){
                for(int k = 1 ; k<=n;k++){
                    if(Math.abs(arr[0]-i) <=2 || Math.abs(arr[1]-j) <=2 || Math.abs(arr[2]-k) <=2 ){
                        cnt ++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
