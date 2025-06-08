


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int A[] = new int[1000001];
    private static int B[] = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // A 이동
        int secondA = 1;
        int status = 0;

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            switch (direction) {
                case "R":
                    for (int j = secondA; j < move + secondA; j++) {
                        A[j] = status +1;
                        status ++;
                    }

                    break;
                case "L":
                    for (int j = secondA; j < move + secondA; j++) {
                        A[j] = status -1;
                        status --;
                    }
                    break;
            }
            secondA += move;

        }

        // B 이동
         int secondB = 1;
         status = 0;

        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            switch (direction) {
                case "R":
                    for (int j = secondB; j < move + secondB; j++) {
                        B[j] = status +1;
                        status ++;
                    }

                    break;
                case "L":
                    for (int j = secondB; j < move + secondB; j++) {
                        B[j] = status -1;
                        status --;
                    }
                    break;
            }
            secondB += move;

        }
        // 나머지 값 채워주기
        int maxIndex = 0;
        if ( secondA > secondB){
            maxIndex = secondA;
            for( int j = secondB; j < maxIndex; j ++){
                B[j] =B[j-1];
            }
        }else{
            maxIndex =secondB;
            for( int j = secondA ; j < maxIndex; j ++){
                A[j] =A[j-1];
            }
        }

        int result = 0 ;
        // 겹치는 구간 찾기
        for ( int i = 1 ; i< maxIndex ; i ++){
            if(A[i] == B[i] && A[i-1] != B[i-1] ){
                result ++;
            }
        }

    }
}
