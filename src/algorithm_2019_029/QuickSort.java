package algorithm_2019_029;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public void quickSort() {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        System.out.println("Given array: ");
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();

        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");

    }
}
