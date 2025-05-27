import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr = new int[200000];
    public static String startColor;
    public static int startPoint = 100000;
    public static int currentPoint = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());

        // 이동하면서 색칠하기
        for (int i = 0; i < loopCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int moveCnt = Integer.parseInt(st.nextToken());
            String moveDirection = st.nextToken();

            // 오른쪽 이동
            if (moveDirection.equals("R")) {
                if (i == 0) {
                    startColor = "black";
                }
                for (int j = currentPoint; j < currentPoint + moveCnt; j++) {
                    arr[j] +=1;
                }
                currentPoint += moveCnt-1;
            } else {  // 왼쪽 이동
                if (i == 0) {
                    startColor = "white";
                }
                for (int j = currentPoint; j > currentPoint - moveCnt; j--) {
                    arr[j] +=1;
                }
                currentPoint -= moveCnt-1;
            }
        }

        //색깔 판단
        int black = 0;
        int white = 0;
        int grey = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==0){
                continue;
            }
            if(arr[i]>=4){
                grey +=1;
                continue;
            }

            if (i > startPoint){ // 시작점
                if(arr[i]%2 == 0){
                    white +=1;
                }else {
                    black +=1;
                }

            }else if(i < startPoint){
                if(arr[i]%2 == 0){
                    black +=1;
                }else {
                    white +=1;
                }
            }else { // startPoint
                if(arr[i]%2 == 0){
                     if (startColor.equals("white")){
                         black +=1;
                     }else{
                         white +=1 ;
                     }
                }else {
                    if (startColor.equals("white")){
                        white +=1;
                    }else{
                        black +=1 ;
                    }
                }
            }
        }

        System.out.printf("%d %d %d%n",white,black,grey);

    }
}
