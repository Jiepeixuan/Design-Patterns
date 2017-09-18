package com.thread.Sync.ch04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class PrintQueue {
    private final Lock queueLock=new ReentrantLock();

    /**
     * Method that prints a document
     * @param document document to print
     */
    public void printJob(Object document){
        queueLock.lock();

        try {
            Long duration=(long)(Math.random()*10000);
            System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n",Thread.currentThread().getName(),(duration/1000));
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }
}
