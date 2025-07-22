

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] start;
    private static int[] end;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        start = new int[n];
        end = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int[] work = new int[2001];
            // 일한 시간 입력
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for(int k =start[j]; k<end[j];k++){
                    work[k]++;
                }
            }
            // 최대로 겹치는 수 구하기
            int duplicateCnt = Integer.MIN_VALUE;
            for(int j = 0 ; j< 2001; j++ ){
                duplicateCnt = Math.max(duplicateCnt,work[j]);
            }
            // 최대로 겹치는 수가 제일 적은 걸 구하기
            if(cnt > duplicateCnt){
                cnt = duplicateCnt;
                result = 0;
                for(int j = 0 ; j< 2001; j++ ){
                    if(work[j] != 0){
                        result ++;
                    }
                }
            }


        }

        System.out.println(result);

    }


}

