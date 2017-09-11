package com.thinkin.java.ch21;

/**
 * Created by peixuan.xie on 2017/7/26.
 */
public class MoreBasicThreads {
    public static void main(String[] args){
        for(int i=0;i<5;i++)
            new Thread(new LiftOff()).start();

        System.out.println("waiting for LiftOff");
    }
}
