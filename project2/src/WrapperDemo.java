

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchai
 */
public class WrapperDemo {
    public static void main(String[] args){
        int n = 7;
        Integer intObj=new Integer(5);
        System.out.println(intObj);
        System.out.println(intObj.toString());
        intObj=n; //boxing
        System.out.println(intObj);
        int y = intObj * 2;
        int s = intObj.intValue();
        System.out.println("y= " + y + ", s= " + s);
        n = Integer.parseInt("1234");
        System.out.println("n= " + n);
        n= Integer.parseInt("1A", 16);
        System.out.println("n= " + n);
    }
}

/*
    Boxing/ auto boxing: encapsulating/wraping a primitive value to an object
    Unboxing:  

*/
