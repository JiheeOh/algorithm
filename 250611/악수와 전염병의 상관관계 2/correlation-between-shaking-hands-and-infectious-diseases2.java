


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] people;
    private static String[] handShake = new String[63000];
    private static int[] spread;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int spreadCnt = Integer.parseInt(st.nextToken());
        int carrier = Integer.parseInt(st.nextToken());
        int handshakeCnt = Integer.parseInt(st.nextToken());

        people = new int[n+1];
        spread = new int[n+1];

        // 최초 감염자와 감염 가능 횟수 등록
        people[carrier] = 1;
        spread[carrier] = spreadCnt;

        // 악수 관계 저장
        for (int i = 0; i < handshakeCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String person1 = st.nextToken();
            String person2 = st.nextToken();

            handShake[time] = person1 + "," + person2;
        }


        // 감염자를 찾아서 people[]에 저장
        for (int j = 0; j < handShake.length; j++) {
            if (handShake[j] != null) {
                int person1 = Integer.parseInt(handShake[j].split(",")[0]);
                int person2 = Integer.parseInt(handShake[j].split(",")[1]);

                if (people[person1] == 1 && spread[person1] > 0) {
                    if (people[person2] != 1) { // 감염자가 아니였을 때 감염 시키고 옮기는 횟수 증가
                        spread[person2] = 2;
                    }
                    people[person2] = 1;
                    spread[person1]--;
                } else if (people[person2] == 1 && spread[person2] > 0) {
                    if (people[person1] != 1) { // 감염자가 아니였을 때 감염 시키고 옮기는 횟수 증가
                        spread[person1] = 2;
                    }
                    people[person1] = 1;
                    spread[person2]--;


                }
            }
        }

        for (int p = 1 ; p< people.length; p ++){
            System.out.print(people[p]);
        }
    }
}
