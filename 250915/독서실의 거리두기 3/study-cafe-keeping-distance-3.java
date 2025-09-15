import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");
        List<Integer> interval = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                interval.add(i);
            }
        }

        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < interval.size()-1; i++) {
            tmp = Math.max(tmp,interval.get(i+1)-interval.get(i));
        }

        System.out.println(tmp/2);


    }


}
