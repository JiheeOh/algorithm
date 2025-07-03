
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

        int maxIndex = getMaxIndex();


        xList.remove(maxIndex);
        yList.remove(maxIndex);

        int distance = 0 ;
        for (int i = 0; i < xList.size() - 1; i++) {
            distance += Math.abs(xList.get(i) - xList.get(i + 1)) + Math.abs(yList.get(i) - yList.get(i + 1));

        }

        System.out.println(distance);

    }

    private static int getMaxIndex() {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < xList.size() - 1; i++) {
            int distance = Math.abs(xList.get(i) - xList.get(i + 1)) + Math.abs(yList.get(i) - yList.get(i + 1));
            arr.add(distance);

            if(distance > max){
                max = distance;
                maxIndex = i+1;
            }
        }
        return maxIndex;
    }


}
