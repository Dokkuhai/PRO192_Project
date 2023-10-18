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
public class CarForSale extends Car implements ForSale{

    
    @Override
    
    
    
    public double getPrice() {
        return 5000;
    }

    public CarForSale(String regNr, String make) {
        super(regNr, make);
    }
    
    
    
    
}
