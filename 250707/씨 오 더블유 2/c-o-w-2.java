
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");


        int result = 0;
        for( int i = 0 ; i< n-2;i++){
            if (input[i].equals("C")){
                for(int j = i+1; j<n-1;j++){
                    if(input[j].equals("O")){
                        for(int k = j+1;k<n;k++){
                            if(input[k].equals( "W")){
                                result++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

}
