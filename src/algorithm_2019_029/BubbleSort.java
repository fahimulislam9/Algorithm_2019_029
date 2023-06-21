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
public class BubbleSort {

    public void bubbleSort() {

        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Bubble sort selected---");

        int list[] = in.listInput();
        // int list[] = {12, 11, 13, 5, 6};

        int n = list.length;
        for (int i = 0; i < n; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(list[k] + " ");
                }
                System.out.println("");
            }

        }

        System.out.print("Sorted output: ");
        out.sortedListOutput(list);


    }
}
