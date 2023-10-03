/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.task2;

/**
 *
 * @author vuduchai
 */
public class RefrigeratedUnit extends GoodsCar{
    private double coolantweight;

    public RefrigeratedUnit(double goodsweight, String id, double tareWeight) {
        super(goodsweight, id, tareWeight);
    } 

    public double getCoolantweight() {
        return coolantweight;
    }
    

    @Override
    public String getDetails() {
        return super.getDetails(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateTotalWeight() {
        return super.calculateTotalWeight() + getCoolantweight(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
