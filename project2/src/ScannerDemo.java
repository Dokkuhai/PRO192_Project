/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        String S = "Anh hùng khôn qua mỹ nhân quan";
        Scanner sc1 = new Scanner (S);
        while (sc1.hasNext()) System.out.println(sc1.next());
        System.out.println();
        String s2 = "abc 123 556.78";
        Scanner sc2 = new Scanner (s2);
        System.out.println(sc2.next());
        System.out.println(sc2.nextInt());
        System.out.println(sc2.nextDouble());
        System.out.println();
        String s3 = "How are    you!    ";
        String delim = "[au\\s]+"; 
        Scanner sc3 = new Scanner (s3);
        sc3.useDelimiter(delim);
        while (sc3.hasNext()) System.out.println(sc3.next());
    }
}
