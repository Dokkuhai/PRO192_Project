/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.task1;

/**
 *
 * @author vuduchai
 */
public class Dog extends Pet{
    private String size;

    public Dog(String size, String id, String name, String owner) {
        super(id, name, owner);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    
    public String getDetails(){
        return getName() + ": " + getId() + "," + getOwner() + "," + getSize();
    }
    
    @Override
    public String toString() {
        return "Dog{" + "size=" + size + '}';
    }
   
    
}

