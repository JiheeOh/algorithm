import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split("");

        List<Integer> distance = new ArrayList<>();
        int cnt = 0;
        boolean startPoint = false;
        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (data[i].equals("1")) {
                if (startPoint) {
                    if(cnt ==0){
                        System.out.println(1);
                        System.exit(0);
                    }
                    cnt++;
                    distance.add(cnt);
                    cnt =0;
                }
                startPoint = true;
            } else if(startPoint){
                cnt++;
            }
        }
        if(!distance.isEmpty()){
            maxDistance = Collections.max(distance)/2;;
        }


        // 맨앞 자리가 비어있을 경우
        if (data[0].equals("0")) {
            int check = 0;
            for (String a : data) {
                if (a.equals("1")) {
                    maxDistance = Math.max(maxDistance, check);
                    break;
                } else {
                    check++;
                }
            }
        }

        // 맨뒤 자리가 비어있을 경우
        if (data[n - 1].equals("0")) {
            int check = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (data[i].equals("1")) {
                    maxDistance = Math.max(maxDistance, check);
                    break;
                } else {
                    check++;
                }
            }
        }

        distance.add(maxDistance);

        System.out.println(Collections.min(distance));

    }
}