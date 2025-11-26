
import java.util.Scanner;

public class Main {
    private static int[] newArr;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quick_sort(arr, 0, n-1);

        for(int i = 0 ;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }

    }

    private static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = partition(arr, low, high);
            quick_sort(arr, low, mid - 1);
            quick_sort(arr, mid + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = high;
        int left = low - 1;
        for (int right = low; right <= high - 1; right++) {
            if (arr[right] < arr[pivot]) {
                left += 1;
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        int tmp = arr[left + 1];
        arr[left + 1] = arr[high];
        arr[high] = tmp;
        return left + 1;
    }
}
