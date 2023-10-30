/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case_Study;

import java.util.Scanner;

/**
 *
 * @author vuduchai
 */
public class Vase extends Item {

    private int height;//height of a vase (>=0 and <=2000)
    private String material;//material of a vase (is not empty)
    //TODO: you add more your codes
    //constructors 

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase() {
    }

    
    //getter
    public int getHeight() {
        
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public int getValue() {
        return value;
    }

    
    public String getCreator() {    
        return creator;
    }

    //setter

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    
    
    //this method  is used to input all fields of a Vase object
    
    
    
    
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        //use try..catch/throws to handle exceptions
        while (true) {
            try {
                
                System.out.print("Input value: ");
                value = input.nextInt();
                if (value < 0) {
                    throw new Exception("Value must be a positive number.");
                }
                
                System.out.print("Input creator: ");
                creator = input.next();
                if(creator.isEmpty()){
                    throw new Exception("Creator can not be empty");
                }
                
                System.out.print("Input height: ");
                height = input.nextInt();
                if (height < 0 || height >2000 ) {
                    throw new Exception("Height value must be between 0 and 2000");
                }

                System.out.print("Input material: ");
                material = input.next();
                if (material.isEmpty()) {
                    throw new Exception("Creator can not be empty");
                }

                break; // breakdown the loop when input is valid!
            } catch (Exception e) {
                System.out.println("Input not valid!" + e.getMessage());
            }
        }
        
        
    }

   
    //this method returns a string that includes  value, creator, height, material  of a vase object 

    @Override
    public String toString() {
        return "Vase |" + "value = " + value + "| creator = " + creator + "| height=" + height + "| material=" + material + '|'; 
    }

    
    

    
    
    
    
    
}
