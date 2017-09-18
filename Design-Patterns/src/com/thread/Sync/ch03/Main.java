package com.thread.Sync.ch03;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Main {
    public static void main(String[] args) {
        EventStorage storage=new EventStorage();

        // Creates a Producer and a Thread to run it
        Producer producer=new Producer(storage);
        Thread thread1=new Thread(producer);

        // Creates a Consumer and a Thread to run it
        Consumer consumer=new Consumer(storage);
        Thread thread2=new Thread(consumer);

        // Starts the thread
        thread2.start();
        thread1.start();
    }
}
