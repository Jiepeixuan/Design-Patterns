package com.thinkin.java.ch21;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class MainThread {

    public static void main(String[] args) {
        LiftOff liftOff=new LiftOff();
        liftOff.run();
        System.out.println("waiting for LiftOff");
    }
}
