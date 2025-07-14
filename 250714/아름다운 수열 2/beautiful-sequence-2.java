


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
        int[] bArr = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bArr);


        // 데이터 찾기
        int count =0;
        for (int i = 0; i < n-m+1; i++) {
            int[] tmp = new int[m];
            for(int j = 0; j< m;j++){
                tmp[j]=arr[i+j];
            }

            Arrays.sort(tmp);

            boolean issame = true;
            for(int k = 0; k < m; k++)
                if(tmp[k] != bArr[k]) {
                    issame = false;
                    break;
                }

            if(issame){
                count++;
            }

        }
        System.out.println(count);


    }

}
