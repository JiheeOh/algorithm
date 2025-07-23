

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 데이터 입력
        int peopleCnt = Integer.parseInt(st.nextToken());
        int cheeseCnt = Integer.parseInt(st.nextToken());
        int eatCnt = Integer.parseInt(st.nextToken());
        int sickCnt = Integer.parseInt(st.nextToken());

        // 치즈 먹은 기록
        int[][] cheeseEatRecord = new int[eatCnt][3];
        for (int j = 0; j < eatCnt; j++) {
            st = new StringTokenizer(br.readLine());
            int[] cheeseEat = new int[3];
            cheeseEat[0] = Integer.parseInt(st.nextToken());
            cheeseEat[1] = Integer.parseInt(st.nextToken());
            cheeseEat[2] = Integer.parseInt(st.nextToken());
            cheeseEatRecord[j] =cheeseEat;
        }

        // 아픈 기록
        int[][] sickRecord = new int[sickCnt][2];
        for (int j = 0; j < sickCnt; j++) {
            st = new StringTokenizer(br.readLine());
            int[] peoplesick = new int[2];
            peoplesick[0] =Integer.parseInt(st.nextToken());
            peoplesick[1]= Integer.parseInt(st.nextToken());
            sickRecord[j] = peoplesick;
        }

        // 상한 치즈 선택
        int result = 0;
        for (int i = 1; i < cheeseCnt + 1; i++) {
            int[] sick = new int[peopleCnt + 1];
            // 아플 애들 미리 저장
            for (int j = 0; j < eatCnt; j++) {
                int person = cheeseEatRecord[j][0];
                int cheese = cheeseEatRecord[j][1];
                int second = cheeseEatRecord[j][2];

                if (cheese == i) {
                    sick[person] = second + 1;
                }
            }

            // 기록이랑 비교
            boolean isBad = true;
            for (int j = 0; j < sickCnt; j++) {
                int person = sickRecord[j][0];
                int sickTime = sickRecord[j][1];
                if (sick[person] > sickTime || sick[person] == 0) {
                    // 현재 i는 상한 치즈가 아니야
                    isBad = false;
                    break;
                } else if (sick[person] <= sickTime) {
                    isBad = true;
                }
            }
            int mediCnt = 0;
            if (isBad) {
                for (int j = 0; j < sick.length; j++) {
                    if (sick[j] > 0) {
                        mediCnt++;
                    }
                }
            }

            result = Math.max(mediCnt,result);
        }
        System.out.println(result);

    }
}
