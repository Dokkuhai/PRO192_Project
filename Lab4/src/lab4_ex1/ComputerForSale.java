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
public class ComputerForSale extends Computer implements ForSale{

    

    @Override
    public double getPrice() {
        return 500;
    }

    public ComputerForSale(String brand, char kind) {
        super(brand, kind);
    }
    
    
}
