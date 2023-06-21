/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_029;


/**
 *
 * @author fahim
 */
public class InsertionSort {

    public void insertionSort() {

        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Insertion sort selected---");

        int list[] = in.listInput();
        // int list[] = {12, 11, 13, 5, 6};

        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            // System.out.println("\nPass " + i + ":");

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
                // for (int k = 0; k < n; k++) {
                // System.out.print(list[k] + " ");
                // }
                // System.out.println("key=> ("+ key +") will take place at pos: "+j);
                // System.out.println("");
            }
            list[j + 1] = key;

        }

        System.out.println("Sorted output: ");
        out.sortedListOutput(list);
    }
}
