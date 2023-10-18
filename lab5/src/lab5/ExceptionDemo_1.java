/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author vuduchai
 */
public class ExceptionDemo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5, y=0;
        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            y=2;
            
        }
        finally
        {
            System.out.println("Hello");
            System.out.println(x/y);
        }
        
    }
    
}
