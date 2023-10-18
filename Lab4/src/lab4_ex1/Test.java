/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ex1;

/**
 *
 * @author vuduchai
 */
public class Test {    
    public static void main(String[] args){
       ForSale[] obj = new ForSale[6];
       obj[0] = new DogForSale("Lam",'s');
       obj[1] = new CarForSale("Toyota","Japan");
       obj[2] = new DogForSale("Dat",'l');
       obj[3] = new ComputerForSale("Mac",'l');
       obj[4] = new ComputerForSale("Dell",'d');
       obj[5] = new CarForSale("KIA","Japan");
       for(int i=0;i<6;i++){
           System.out.println(obj[i].toString());
       }
       System.out.println();
       for(int i=0;i<6;i++){
           if(obj[i] instanceof CarForSale){
               System.out.println(obj[i].toString());
           }
       }
       
       System.out.println();
       int count = 0;
       for(int i=0;i<6;i++){
           if(obj[i] instanceof DogForSale){
               if(((DogForSale)obj[i]).getSize() == 's'){
                   count++;
               }
           }
       }
       System.out.println(count);
    }
}
