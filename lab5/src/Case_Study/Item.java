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
public class Item
{   // declare fields 
    protected int value;  // the price of a Item (>=0)
    protected String creator;  // the creator who creates  the item( is not empty)
    //constructors 
    public Item(){         
        value=0;
        creator="";     
    } 
    public Item(int value, String creator){  
        this.value=value;
        this.creator=creator;
    }
	//getters,setters:  you is required to add more code to get/set fields of a Item object

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
	//this method  is used to input all fields of a Item object
    public void input(){  
            
        //use Scanner class to input fields
        Scanner input = new Scanner(System.in);
        //use try..catch/throws to handle exceptions
        while(true){
            try{
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
                
                break; // breakdown the loop when input is valid!
            }
            catch(Exception e){
                System.out.println("Input not valid!" + e.getMessage());
            }
        }
    }
    //this method returns a string that includes  value, creator of a Item object 
    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
                 
}                 