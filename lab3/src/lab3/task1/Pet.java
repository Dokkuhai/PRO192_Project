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

public class Pet {
    private String id;
    private String name;
    private String owner;
    
    public Pet(String id, String name, String owner){
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
            
    public String getDetails(){
        return name + ":" + id + "," + owner;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", owner=" + owner + '}';
    }
    
    public static void showAllDog(Pet[] pets){
        for(Pet obj: pets){
            if(obj instanceof Dog){
                System.out.println(obj.getDetails());
            }
            
        }
    }
    
    public static void showDogNotDangerous(Pet[] pets){
        for(Pet obj: pets){
            if((obj instanceof Dog)){
                if(!(obj instanceof Dog)){
                    System.out.println(obj.getDetails());
                }    
            }
        }
    }
    
    public static int showTotalIncidents(Pet[] pets) {
        int totalIncidents = 0;
        for (Pet obj : pets) {
            if (obj instanceof DangerousDog) {
                totalIncidents += ((DangerousDog) obj).getReportedIncidents();
            }
        }
        return totalIncidents;
    }
    
    public static void main(String[] args){
        Pet[] pets = new Pet[5];
        pets[0] = new Dog("1", "Sher", "Cuong", "Large");
        pets[1] = new Dog("2", "Chun", "Huong", "Medium");
        pets[2] = new DangerousDog("3", "Watson", "Ha", "Small", 2);
        pets[3] = new DangerousDog("4", "John", "Canh", "Large", 6);
        pets[4] = new Cat("5","White","Meow","Nhung");
        pets[5] = new Cat("6","Black","Lu","Mai");
        showAllDog(pets);
        showDogNotDangerous(pets);
       System.out.println(showTotalIncidents(pets));
    }
}
