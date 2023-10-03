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
public class wordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] strs = s1.split("[. ]+");
        String s2 = sc.next();
        boolean check = strs[0].equals(s2);
        System.out.println(check);
        Integer count = 0;
        if(check){
            for(int i=0;i<strs.length;i++){
                if(strs[i].equals(s2)){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    
}
