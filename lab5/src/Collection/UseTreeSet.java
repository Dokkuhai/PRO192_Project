/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Dokkuhai
 */
public class UseTreeSet {
   public static void main(String[] args){
       TreeSet t = new TreeSet();
       t.add(5);
       t.add(2);
       t.add(9);
       t.add(30);
       t.add(9);
       System.out.println(t);
       t.remove(9);
       System.out.println(t);
       Iterator it = t.iterator();
       while(it.hasNext()){
           System.out.print(it.next() + ", ");
       }
       System.out.println();
       
   } 
}
