package com.thinkin.java.ch21;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/10/24.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {

        try {
            while(true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch(InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true); // Must call before start()
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(150);
    }
}
