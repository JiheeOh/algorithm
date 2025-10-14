import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] B = new int[2];
        int[] L = new int[2];
        int[] R = new int[2];
        for (int i = 0; i < 10; i++) {
            String[] data = br.readLine().split("");
            for (int j = 0; j < 10; j++) {
                if (data[j].equals("B")) {
                    B[0] = i;
                    B[1] = j;
                } else if (data[j].equals("L")) {
                    L[0] = i;
                    L[1] = j;
                } else if (data[j].equals("R")) {
                    R[0] = i;
                    R[1] = j;
                }
            }
        }
        int result = Math.abs(L[0] - B[0]) + Math.abs(L[1] - B[1]) - 1;
        if (L[0] == B[0] && B[0] == R[0] && R[1] > L[1] && R[1] < B[1]) {

            result += 2;
        } else if (L[1] == B[1] && B[1] == R[1] && R[0] > L[0] && R[0] < B[0]) {
            result += 2;
        }
        System.out.println(result);

    }
}