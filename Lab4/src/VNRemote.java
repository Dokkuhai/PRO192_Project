/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchai
 */
public interface VNRemote {
    final int MaxofButtons=20;
    int price =120;
    public static void setTimer(int number){
        System.out.println("shut down after: " + number + "seconds");
    }
    public abstract void onDevice();
    abstract public void offDevice();
    default void setLock(){
        System.out.println("set lock in the default method");
        
    }
        
}
