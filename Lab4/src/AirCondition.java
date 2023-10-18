/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchai
 */



public class AirCondition implements KoreaRemote{

    @Override
    public void subtitle(String language) {
        System.out.println("display" + language);
    }

    @Override
    public void onDevice() {
        System.out.println("on AC");
    }

    @Override
    public void offDevice() {
        System.out.println("off AC");
    }
    
    public static void main(String[] args){
        KoreaRemote re = new AirCondition();
        re.onDevice();
        re.subtitle("Korean");
        re.setLock();
    }
}
