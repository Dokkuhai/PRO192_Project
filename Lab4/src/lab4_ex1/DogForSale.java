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
public class DogForSale extends Dog implements ForSale{

    
    

    @Override   
    public double getPrice() {
        return 1000;
    }

    public DogForSale(String name, char size) {
        super(name, size);
    }

    @Override
    public char getSize() {
        return super.getSize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

