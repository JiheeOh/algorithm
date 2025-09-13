import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int distance = Integer.parseInt(br.readLine());

        int status = 0 ;
        int speed = 1;
        int time = 0 ;
        while(status < distance){
            status+= speed;
            if(checkSpeed(speed+1,distance-status)){
                speed++;
            }else if(checkSpeed(speed,distance-status)){
            }else{
                speed --;
            }
            time ++;
        }
        System.out.println(time);
    }

    private static boolean checkSpeed(int speed, int remainDistance) {
        int sum = 0 ;
        for(int i =1; i<=speed;i++){
            sum+= i;
        }
        if(sum <= remainDistance){
            return true;
        }else{
            return false;
        }
    }


}
