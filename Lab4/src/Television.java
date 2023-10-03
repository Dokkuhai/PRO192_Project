/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchai
 */
public class Television implements VNRemote{
    public void onDevice(){
        System.out.println("onTV");
        
    }
    
    public void offDevice(){
        System.out.println("offTV");
        
    }
    
    public static void main(String[] args){
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price: " + VNRemote.price);
        System.out.println("TV Remote " + VNRemote.MaxofButtons + "buttons");
    }
    
    
}
