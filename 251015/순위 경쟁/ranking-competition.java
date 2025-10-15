import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String winners = "012";

        int[] scoreArray = {0, 0, 0};

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder tmpWinners = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            // 점수 반영
            switch (person) {
                case "A":
                    scoreArray[0] += score;
                    break;
                case "B":
                    scoreArray[1] += score;
                    break;
                case "C":
                    scoreArray[2] += score;
                    break;
            }

            // 최대 점수자 확인
            int maxScore = Integer.MIN_VALUE;
            String maxIndex = "";
            for (int j = 0; j < 3; j++) {
                if (scoreArray[j] > maxScore) {
                    maxScore = scoreArray[j];
                    maxIndex= Integer.toString(j);
                }else if(scoreArray[j] == maxScore){
                    maxIndex += maxIndex+ j;
                }
                tmpWinners.append(maxIndex);
            }

            // 명예의 전당 비교
            if(!tmpWinners.toString().equals(winners)){
                winners = tmpWinners.toString();
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}