

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int p = j + 1; p < n; p++) {
                    boolean unique = true;
                    int [] arr = new int[100+1];
                    for (int q = 0; q < n; q++) { // 3개 제외하고 남은 선분들
                        if(q==i || q == j || q == p ){
                            continue;
                        }
                        for( int k = start[q] ; k<= end[q] ; k++){ // 각 선분들이 겹치는 지 확인
                            if(arr[k] ==0){
                                arr[k] = 1;
                            }else{
                                unique =false;
                                break;
                            }
                        }
                        if(!unique){
                            break;
                        }
                    }
                    if (unique) {
                        cnt++;
                    }
                }
            }
        }


        System.out.println(cnt);
    }
}
