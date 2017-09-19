package com.thread.SyncUtils.ch01;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/19.
 */
public class PrintQueue {

    private final Semaphore semaphore;

    public PrintQueue(){
        semaphore=new Semaphore(5);
    }

    public void printJob(Object document){
        try {
            semaphore.acquire();

            Long duration=(long)(Math.random()*10);
            System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n",Thread.currentThread().getName(),duration);
            Thread.sleep(duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Free the semaphore. If there are other threads waiting for this semaphore,
            // the JVM selects one of this threads and give it the access.
            semaphore.release();
        }
    }

}
