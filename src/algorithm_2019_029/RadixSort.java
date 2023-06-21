package algorithm_2019_029;

import java.util.Arrays;



public class RadixSort {
    public void radixSort() {
        Input in = new Input();
        Output out = new Output();
        CountingSort cSort = new CountingSort();

        System.out.println("\n---Radix sort selected---");

        int list[] = in.listInput();
        // int list[] = { 181, 289, 390, 121, 15, 736, 514, 8, 1220 };

        int max = Arrays.stream(list).max().getAsInt();

        for (int place = 1; max / place > 0; place *= 10)
            cSort.countSort(list, list.length, place);

        System.out.println("Sorted output: ");
        out.sortedListOutput(list);

    }
}
