import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp % 2 == 0) {
                even.add(tmp);
            } else {
                odd.add(tmp);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (!even.isEmpty()) {
                    even.pop();
                    cnt++;
                } else {
                    for (int j = 0; j < 2; j++) {
                        try {
                            odd.pop();
                        } catch (Exception e) {
                            System.out.println(cnt-1);
                            System.exit(0);
                        }
                    }
                    cnt++;

                }
            } else {
                if(!odd.isEmpty()){
                    odd.pop();
                    cnt++;
                }else{
                    System.out.println(cnt);
                    System.exit(0);
                }
            }
            if(odd.isEmpty() && even.isEmpty()){
                System.out.println(cnt);
                break;
            }
        }


    }

}