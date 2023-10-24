/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_ex;

/**
 *
 * @author Dokkuhai
 */
public class Person {
    private String code,name,address,position;
    private double salary;

    public Person(String code, String name, String address, String position, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
    Person() {
        
    }
    
    //make a function to input all information of player
    
    public void input(){
        
    }
    
    
    //make a function to show all information of player
    
    public void show(){
        System.out.println("Code:"+ this.getCode());
        System.out.println("Name:" + this.getName());
        System.out.println("Position:" + this.getPosition());
        System.out.println("Address:" + this.getAddress());
        System.out.println("Salary: " + this.getSalary());
    }
}
