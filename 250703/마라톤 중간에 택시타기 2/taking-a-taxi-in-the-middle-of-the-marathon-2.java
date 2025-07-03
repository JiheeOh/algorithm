

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static List<Integer> arr = new ArrayList<>();
    private static List<Integer> xList = new ArrayList<>();
    private static List<Integer> yList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }

        int minDistance = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            int distance = 0;
            int prevIdx = 0;
            for (int j = 1; j < n; j++) {
                if(j == i){
                    continue;
                }
                distance += Math.abs(xList.get(prevIdx) - xList.get(j )) + Math.abs(yList.get(prevIdx) - yList.get(j ));
                prevIdx = j;
            }
            if (minDistance > distance) {
                minDistance = distance;
            }
        }


        System.out.println(minDistance);

    }


}
