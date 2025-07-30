


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bombCnt = Integer.parseInt(st.nextToken());
        int distance = Integer.parseInt(st.nextToken());

        int[] data = new int [bombCnt];
        for(int i=0; i< bombCnt ; i++){
            data[i] = Integer.parseInt(br.readLine());
        }

        int result = -1;
        for( int i = 0; i < bombCnt-1 ; i++){
            boolean boom = false;
            int boomNum = -1;
            for( int j = i+1 ; j< i+distance+1;j++){
                if( j < bombCnt && data[i]==data[j]){
                    boom = true;
                    boomNum = data[i];
                    break;
                }

            }
            if(boom){
                result = Math.max(result,boomNum);
            }
        }
        System.out.println(result);
    }
}
