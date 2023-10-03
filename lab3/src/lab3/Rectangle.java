/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vuduchai
 */
public class Rectangle {
    private int length = 0;
    private int width = 0;
    // overloading constrcutors
    public Rectangle() //default constructors
    {   }
    public Rectangle (int l, int w){
        length=l>0? l:0; width=w>0? w:0;
    }
    //overriding the toString method of the java.lang.Object class

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area() {return length*width; }
    }
