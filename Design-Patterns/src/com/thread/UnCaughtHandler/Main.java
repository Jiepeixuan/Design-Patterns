package com.thread.UnCaughtHandler;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Main {
    public static void main(String[] args) {
        Task task=new Task();
        // Creates the Thread
        Thread thread=new Thread(task);
        // Sets de uncaugh exceptio handler
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        // Starts the Thread
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Thread has finished\n");
    }
}
