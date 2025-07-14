import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static String[] arr = new String[101];

    public static void main(String[] args) throws IOException {

        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int status = Integer.parseInt(st.nextToken());
            arr[status] = st.nextToken();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i ; j++) {
                if ( arr[i] == null || arr[i+j] ==null){
                continue;
                }
                if (isAllG(i, i+j) || isAllH(i, i+j) || isMatch(i, i+j)) {
                    if (j > max) {
                        max = j;
                    }
                }
            }
        }
        System.out.println(max);
    }

    private static boolean isMatch(int start, int end) {
        boolean result = false;
        int gCnt = 0;
        int hCnt = 0;
        for (int i = start; i < end + 1; i++) {
            if(arr[i]== null){
                continue;
            }
            if (arr[i].equals("G")) {
                gCnt++;
            } else {
                hCnt++;
            }
        }
        if (gCnt == hCnt) {
            return true;
        }
        return result;
    }

    private static boolean isAllH(int start, int end) {
        boolean result = true;
        for (int i = start; i < end + 1; i++) {
            if(arr[i] == null){
                continue;
            }
            if (!arr[i].equals("H")) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isAllG(int start, int end) {
        boolean result = true;
        for (int i = start; i < end + 1; i++) {
            if(arr[i] == null){
                continue;
            }
            if (!arr[i].equals("G")) {
                result = false;
                break;
            }
        }
        return result;
    }

}
