import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int studentCnt = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int maxCnt = Integer.parseInt(st.nextToken());

        int[] student = new int[studentCnt+1];

        int result = -1;
        for ( int i= 0 ; i< m; i++){
            int warning = Integer.parseInt(br.readLine());
            student[warning] = student[warning] + 1;

            if(student[warning]>= maxCnt ){
                result = warning;
                break;
            }

        }
        System.out.println(result);
    }
}
