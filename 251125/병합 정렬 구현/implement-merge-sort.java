import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static int n = 0;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int k = low;
        int i = low;
        int j = mid + 1;

        int[] newArr = new int[n];
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                newArr[k] = arr[i];
                k++;
                i++;
            } else {
                newArr[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            newArr[k] = arr[i];
            i++;
            k++;
        }


        while (j <= high) {
            newArr[k] = arr[j];
            j++;
            k++;
        }

        for (int p = low; p <= high; p++) {
            arr[p] = newArr[p];
        }
    }
}
