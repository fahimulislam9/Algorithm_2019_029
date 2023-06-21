/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_029;

import java.util.Scanner;

/**
 *
 * @author fahim
 */
public class Input {

    Scanner s = new Scanner(System.in);

    public int[] listInput() {
        System.out.print("Enter the number of element:> ");
        int n = s.nextInt();
        System.out.println("Enter the elements:> ");

        int list[] = new int[n];
        for (int i = 0; i < list.length; i++) {
            System.out.print("\tindex{" + i + "}= ");
            list[i] = s.nextInt();
        }

        return list;
    }

    public int keyInput() {
        System.out.print("Enter key value:> ");
        return s.nextInt();

    }
    public int valueInput( String msg) {
        System.out.print(msg);
        return s.nextInt();

    }
}
