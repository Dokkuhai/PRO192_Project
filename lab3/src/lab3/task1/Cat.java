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
public class Cat extends Pet{
    private String hairType;

    public Cat(String id,String hairType, String name, String owner) {
        super(id, name, owner);
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    @Override
    public String toString() {
        return "Cat{" + "hairType=" + hairType + '}';
    }
    
    public String getDetails(){
        return getName() + ": " + getId() + "," + getOwner() + "," + getHairType();
    }
    
    
}
