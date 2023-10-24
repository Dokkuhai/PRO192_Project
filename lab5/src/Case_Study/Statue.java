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
public class Statue extends Item {

    private int weight; //the weight of a statue object (weght>=0 and <=1000)
    private String colour; ////the colour of a statue object (is not empty)
    //You add more your code
    //constructors

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
    }

    
    
    public int getWeight() {
        return weight;
        //use Scanner class to input fields
        //use try..catch/throws to handle exceptions
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }

    //getter
    public String getCreator() {    
        return creator;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //setter
    public void setColour(String colour) {    
        this.colour = colour;
    }

    //this method  is used to input all fields of a statue object
    public void input() {
        //use Scanner class to input fields
        Scanner input = new Scanner(System.in);
        //use try..catch/throws to handle exceptions
        
        while (true) {
            try {
                System.out.print("Input height: ");
                weight = input.nextInt();
                if (weight < 0 || weight > 1000) {
                    throw new Exception("Weight value must be between 0 and 1000");
                }

                System.out.print("Input color: ");
                colour = input.next();
                if (colour.isEmpty()) {
                    throw new Exception("Color can not be empty");
                }

                break; // breakdown the loop when input is valid!
            } catch (Exception e) {
                System.out.println("Input not valid!" + e.getMessage());
            }
        }
        
    }
    //this method returns a string that includes  value, creator, weight, colour of a statue object 

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + "weight=" + weight + "color=" + colour +'}';
    }
}
