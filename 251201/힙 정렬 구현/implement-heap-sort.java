

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        heap_sort(arr, n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

    private static void heap_sort(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i );
        }

        for (int i = n ; i >= 1; i--) {
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            heapify(arr, i - 1, 1);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, n, largest);
        }


    }


}
