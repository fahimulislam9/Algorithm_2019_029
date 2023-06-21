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
public class Output {
    public void sortedListOutput(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public void searchResultFoundOutput(int key, int index) {
        System.out.println("Key(" + key + ") found at index: " + index);
    }

    public void searchResultNotFoundOutput(int key) {
        System.out.println("Key(" + key+ ") not found.");
    }
}
