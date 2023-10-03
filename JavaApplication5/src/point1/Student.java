/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point1;

/**
 *
 * @author vuduchai
 */
public class Student {
    private int RollNumber;
    private String name;
    private int age;
    private String course;
    private Car vehicle;
    
    public Student(){
        RollNumber = 0;
        name = "";
        age = 0;
        course = "";
        vehicle = null;
    }
    
    public Student(int Rollnumber,String name,int age, String course, Car vehicle){
        this.RollNumber = RollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.vehicle = vehicle;
    }
    
    public String toString(){
        return "[";
    }
    
}
