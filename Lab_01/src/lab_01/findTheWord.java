/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01;

import java.util.Scanner;

/**
 *
 * @author vuduchai
 */
public class findTheWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] strs = s1.split("[. ]+");
        System.out.print("Input: ");
        Integer n = sc.nextInt();
        for (int i = 0; i <strs.length; i++) {
            if(i == n){
                System.out.print("Result: ");
                System.out.print(strs[i-1]);
            }
        }
        System.out.println();
    }
}
