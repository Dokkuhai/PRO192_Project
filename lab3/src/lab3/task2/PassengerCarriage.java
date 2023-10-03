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
public class PassengerCarriage extends RailroadCar{
    private int numberOfPassengers;

    public PassengerCarriage(int numberOfPassengers, String id, double tareWeight) {
        super(id, tareWeight);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double calculateTotalWeight() {
        return super.calculateTotalWeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDetails() {
        return super.getDetails(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
