package algorithm_2019_029;



public class SelectionSort {
    public void selectionSort() {
        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Selection sort selected---");
        int list[] = in.listInput();
        // int list[] = { 12, 11, 13, 5, 6 };

        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            int min_ind = i;
            for (int j = i + 1; j < n; j++)
                if (list[j] < list[min_ind])
                    min_ind = j;

            int temp = list[min_ind];
            list[min_ind] = list[i];
            list[i] = temp;

            for (int k = 0; k < n; k++) {
                System.out.print(list[k] + " ");
            }
            System.out.println("");
        }

        System.out.print("Sorted output: ");
        out.sortedListOutput(list);

    }
}
