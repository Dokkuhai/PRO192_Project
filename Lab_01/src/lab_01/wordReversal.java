/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01;

/**
 *
 * @author vuduchai
 */
import java.util.Scanner;

public class wordReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] strs = s1.split("[. ]+");

        for (int i = strs.length - 1; i >= 0; i--) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();
    }
}
