import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[] A = new int[1000000];
    private static int[] B = new int[1000000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = -1;
        // A 움직임 기록
        int status = 1;
        for(int i = 0 ; i< n; i ++){
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int move = Integer.parseInt(st.nextToken());
            switch (direction){
                case "R" :
                    while(move >0){
                        A[status]= A[status-1] +1;
                        status++;
                        move--;

                    }
                    break;

                case "L":
                    while(move >0){
                        A[status]= A[status-1] -1;
                        status++;
                        move--;

                    }
                    break;
            }

        }

        // B 움직임 기록
        status = 1;
        for(int i = 0 ; i< m; i ++){
            st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int move = Integer.parseInt(st.nextToken());
            switch (direction){
                case "R" :
                    while(move >0){
                        B[status]= B[status-1] +1;
                        if (A[status] == B[status]){
                            answer = status;
                            break;
                        }
                        status++;
                        move--;

                    }
                    break;

                case "L":
                    while(move >0){
                        B[status]= B[status-1] -1;
                        if (A[status] == B[status]){
                            answer = status;
                            break;
                        }
                        status++;
                        move--;

                    }
                    break;
            }

        }
        System.out.println(answer);
    }
}
