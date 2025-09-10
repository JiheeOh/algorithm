import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start1 = Integer.parseInt(st.nextToken());
        int end1 = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int start2 = Integer.parseInt(st.nextToken());
        int end2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];
        for (int i = start1; i < end1; i++) {
            arr[i] = 1;
        }
        for (int i = start2; i < end2; i++) {
            arr[i] = 1;
        }

        int cnt = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] ==1){
                cnt +=1;
            }
        }

        System.out.println(cnt);
    }


}
