/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point1;

/**
 *
 * @author vuduchai
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;
     public Car(){
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        parkingBrake = false;
    }
    
   
    public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake){
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartbutton(){
        System.out.println("You can press the start button");
    }
    
    public void pressAcceleratorbutton(){
        System.out.println("You can press the accelerator button");
        System.out.println("Color: "+Colour);
        System.out.println("EnginePower: "+EnginePower);
        System.out.println("Convertible: "+Convertible);
        System.out.println("pakingBrake: "+parkingBrake);
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartbutton();
        c.pressAcceleratorbutton();
        
        Car c2=new Car();
        c2.pressAcceleratorbutton();
        
        Car c3=new Car("red",100,true,true);
        c3.pressAcceleratorbutton();
        c3.setColour("black");
        System.out.println("Color of c3:"+c3.getColour());
    }    
    
}
