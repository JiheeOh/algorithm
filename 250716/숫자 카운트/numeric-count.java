
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            count1[i] = Integer.parseInt(st.nextToken());
            count2[i] = Integer.parseInt(st.nextToken());

        }
        int answerCnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    boolean isAnswer = true ;
                    for (int q = 0; q < n; q++) {
                        int hundred = arr[q] / 100;
                        int ten = arr[q] % 100 / 10;
                        int one = arr[q] % 10;

                        int cnt1 = 0;
                        int cnt2 = 0 ;

                        //1. count1 증가
                        if(i == hundred){
                            cnt1++;
                        }
                        if(j == ten){
                            cnt1++;
                        }
                        if(k == one){
                            cnt1++;
                        }

                        //2. count2 증가
                        if(i == ten || i ==one){
                            cnt2++;
                        }if(j == hundred || j ==one){
                            cnt2++;
                        }if(k == hundred || k ==ten){
                            cnt2++;
                        }

                        if(cnt1 != count1[q] || cnt2 !=count2[q]){
                            isAnswer = false;
                            break;
                        }
                    }
                    if(isAnswer){
                        answerCnt++;
                    }
                }
            }
        }
        System.out.println(answerCnt);
    }
}