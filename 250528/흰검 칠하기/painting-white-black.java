import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int MAX = 100000;

    public static int[] arr = new int[2*MAX +1];
    public static int[] blackArr = new int[2*MAX +1];
    public static int[] whiteArr = new int[2*MAX +1];
    public static int currentPoint = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());

        // 이동하면서 색칠하기
        for (int i = 0; i < loopCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int moveCnt = Integer.parseInt(st.nextToken());
            String moveDirection = st.nextToken();

            if(moveDirection.equals("L")){
                while(moveCnt-->0){
                    arr[currentPoint] = 1; // white로 칠한다.
                    whiteArr[currentPoint] ++;
                    if(moveCnt > 0){
                        currentPoint --;
                    }

                }
            }else{
                while(moveCnt -->0){
                    arr[currentPoint] =2; // black으로 칠한다
                    blackArr[currentPoint] ++;
                    if(moveCnt > 0){
                        currentPoint ++;
                    }
                }
            }



        }
        // 색깔 계산하기
        int white = 0;
        int black = 0;
        int grey = 0;

        for(int i =0; i<arr.length;i++){
            if(blackArr[i] >=2 && whiteArr[i] >=2){
                grey ++;
            } else if (arr[i] == 1) {
                white ++;
            }else if(arr[i] ==2){
                black++;
            }

        }



        System.out.printf("%d %d %d%n",white,black,grey);
    }

}
