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
public class antiqueShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ItemList obj = new ItemList();
        do {
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. Export to the file");
            System.out.println("11. exit");
            System.out.print("input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if (obj.addItem(tmp)) {
                        System.out.println("added Vase!");
                    }
                    break;
                case 2:
                    Item tmpStatue = new Statue();
                    tmpStatue.input();
                    if (obj.addItem(tmpStatue)) {
                        System.out.println("added Statue!");
                    }
                    break;	
                case 3:
                    Item tmpPainting = new Painting();
                    tmpPainting.input();
                    if (obj.addItem(tmpPainting)) {
                        System.out.println("added Painting!");
                    }
                    break;
                    
                case 4:
                    obj.displayAll();
                    break;
                    
                case 5:
                    System.out.print("Input the creator to find: ");
                    String tmpCreator = sc.next();
                    Item found = obj.findItem(tmpCreator);
                    if(found != null){
                        System.out.println("Item found : " + found);
                    }
                    else System.out.println("Item not found!");
                case 6:
                   
                    
            }//end switch
        }while (choice <= 10); //end while
    }
}  //end class
