package com.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class PrimeGenerator_Main {

    public static void main(String[] args) {
        Thread thread = new PrimeGenerator();
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

}
