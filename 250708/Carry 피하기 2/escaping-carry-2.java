

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        // 세 개의 값을 배열화

        int maxPlus = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean carry = false;

                    // 일의 자리에서 발생
                    if(input[i]%10 + input[j]%10+input[k]%10 >=10){
                        carry = true;
                    }
                    // 십의 자리
                    if(input[i]%100/10 + input[j]%100/10+input[k]%100/10 >=10){
                        carry = true;
                    }
                    // 백의 자리
                    if(input[i]%1000/100 + input[j]%1000/100 +input[k]%1000/100  >=10){
                        carry = true;
                    }
                    // 천의 자리
                    if(input[i]%10000/1000 + input[j]%10000/1000 +input[k]%10000/1000  >=10){
                        carry = true;
                    }
                    if(!carry){
                        maxPlus = Math.max(maxPlus,input[i]+input[j]+input[k]);
                    }

                }
            }
        }
        System.out.println(maxPlus);


    }

}
