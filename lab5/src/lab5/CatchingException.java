/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author vuduchai
 */
public class CatchingException {
    
    public static int inputInteger() {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter a whole number: ");
                n = Integer.parseInt(in.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.println("Required integer!");
            }
        } while (cont == true || n < 10 || n > 50);
        return n;
    }

    public static void main(String[] args) {
        int n = inputInteger();
        System.out.print("number:" + n); 
    }
    
}
