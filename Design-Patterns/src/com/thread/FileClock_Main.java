package com.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class FileClock_Main {
    public static void main(String[] args) {
        FileClock clock=new FileClock();
        Thread thread=new Thread(clock);

        // Starts the Thread
        thread.start();
        try {
            // Waits five seconds
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        // Interrupts the Thread
        thread.interrupt();
    }
}
