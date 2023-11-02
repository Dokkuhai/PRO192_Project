/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Dokkuhai
 */

import java.util.Vector;
public class Point {
    int x,y;

    public Point() {
        x=0;
        y=0;
    }

    public Point(int xx, int yy) {
        x = xx;
        y = yy;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}



