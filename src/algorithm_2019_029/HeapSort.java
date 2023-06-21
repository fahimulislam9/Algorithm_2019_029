package algorithm_2019_029;


public class HeapSort {
    public void heapSort() {
        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Counting sort selected---");

        // int list[] = in.listInput();
        int list[] = { 12, 11, 13, 5, 6 };

        int N = list.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(list, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);
        }

        System.out.print("Sorted output: ");
        out.sortedListOutput(list);
    }

    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }

}
