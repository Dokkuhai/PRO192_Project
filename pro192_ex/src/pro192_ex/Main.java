/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Dokkuhai
 */
public class Main {
    
    static BufferedReader in = new BufferedReader(new InputStream());
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Make an object for Person
        Person p = new Person();
        System.out.print("Enter code: ");
        p.setCode(in.readLine());
        
        //
        p.input();
        //Display all the player in team
        p.show();
    }
    
}

