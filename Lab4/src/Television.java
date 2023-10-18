/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchai
 */
public class Television implements VNRemote,ChinaRemote{
    @Override
    public void onDevice(){
        System.out.println("on TV");
        
    }
    
    @Override
    public void offDevice(){
        System.out.println("off TV");
        
    }
    @Override
    public void increaseVolumn(){
        System.out.println("Increasing Volumn");
    }
    
    @Override
    public void descVolumn(){
        System.out.println("Decreasing volumn");
    }
    public static void main(String[] args){
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price: " + VNRemote.price);
        System.out.println("TV Remote has: " + VNRemote.MaxofButtons + "buttons");
        ChinaRemote remote2 = new Television();
        
    }
    
    
}
