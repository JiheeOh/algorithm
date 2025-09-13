import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int distance = Integer.parseInt(br.readLine());

        int result = Integer.MAX_VALUE;
        for(int i= 1; i<distance;i++){
            int fast = 1;
            int go = 0;
            int time = 0;
            while(go <= distance -1){
                if(time < i ){
                    fast++;
                }else{
                    if(fast>1){
                        fast--;
                    }
                }
                go+= fast;
                time++;
            }
            if (fast == 1){
                result = Math.min(result,time);
            }else{
                break;
            }
        }
        System.out.println(result);
    }


}
