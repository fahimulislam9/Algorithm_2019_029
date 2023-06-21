package algorithm_2019_029;

import java.util.*;

public class CountingSort {
    public void countSort() {
        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Counting sort selected---");

        int list[] = in.listInput();
        // int list[] = { 12, 11, 13, 5, 6 };

        int max = Arrays.stream(list).max().getAsInt();
        int min = Arrays.stream(list).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            count[list[i] - min]++;
            // System.out.println(list[i] - min);
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = list.length - 1; i >= 0; i--) {
            output[count[list[i] - min] - 1] = list[i];
            count[list[i] - min]--;
        }

        System.out.println("Sorted output: ");
        out.sortedListOutput(output);

    }

    public void countSort(int list[], int n, int place) {

        int max = Arrays.stream(list).max().getAsInt();
        int min = Arrays.stream(list).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            count[(list[i] / place) % 10]++;

        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = list.length - 1; i >= 0; i--) {
            output[count[(list[i] / place) % 10] - 1] = list[i];
            count[(list[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++)
            list[i] = output[i];

    }
}
