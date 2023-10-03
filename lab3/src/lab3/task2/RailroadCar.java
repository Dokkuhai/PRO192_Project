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
public class RailroadCar {
    private String id;
    private double tareWeight;

    public RailroadCar(String id, double tareWeight) {
        this.id = id;
        this.tareWeight = tareWeight;
    }

    public String getId() {
        return id;
    }

    public double getTareWeight() {
        return tareWeight;
    }

    @Override
    public String toString() {
        return "RailroadCar{" + "id=" + id + ", tareWeight=" + tareWeight + '}';
    }
    
    public String getDetails(){
        return "";
    }
    
    public double calculateTotalWeight(){
        return getTareWeight();
    }
    
    
}
