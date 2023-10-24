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
public class Painting extends Item {

    private int height; //the height of a painting object (height>=0 and <=2000)
    private int width; //the width of a painting object (height>=0 and <=3000)
    private boolean isWatercolour; //the painting object uses a watercolor or not
    private boolean isFramed; //the painting object has s a frame or not
    //You add more your code
    //constructors 

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting() {
    }
    
    
    
    //getter
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
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

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    
    
    //this method  is used to input all fields of a painting object
    public void input() {
        //use Scanner class to input fields
        Scanner input = new Scanner(System.in);
        
        //use try..catch/throws to handle exceptions
        
        while (true) {
            try {
                System.out.print("Input height: ");
                height = input.nextInt();
                if (height < 0 || height > 2000) {
                    throw new Exception("Height value must be between 0 and 2000");
                }

                System.out.print("Input width: ");
                width = input.nextInt();
                if (width < 0 || width > 3000) {
                    throw new Exception("Width valur must be between 0 and 3000");
                }
                
                System.out.print("Is Painting use watercolor? (True = yes, False = No): ");
                isWatercolour = input.nextBoolean();
                if (isWatercolour != true && isWatercolour != false) {
                    throw new Exception("isWatercolour value only can received true or false!");
                }
                
                System.out.print("Is Painting has a frame? (True = yes, False = No): ");
                isFramed = input.nextBoolean();
                if (isFramed != true && isFramed != false) {
                    throw new Exception("isFramed value only can received true or false!");
                }
                

                break; // breakdown the loop when input is valid!
            } catch (Exception e) {
                System.out.println("Input not valid!" + e.getMessage());
            }
        }
        
        
        
    }
    //this method returns a string that includes  all fields  of a painting object 

    @Override
    public String toString() {
        return "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
    }

    
}
