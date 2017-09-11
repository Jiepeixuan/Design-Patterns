package com.thinkin.java.ch21;


public class BasicThread {

    public static void main(String[] args){
        Thread thread=new Thread(new LiftOff());
        thread.start();
        System.out.println("waiting for LiftOff");
    }
}
