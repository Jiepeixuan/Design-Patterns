package com.thread.Executor.ch06;

import java.util.Date;

/**
 * Created by peixuan.xie on 2017/9/22.
 */
public class Task implements Runnable {

    /**
     * Name of the task
     */
    private String name;

    /**
     * Constructor of the class
     * @param name the name of the class
     */
    public Task(String name) {
        this.name=name;
    }

    /**
     * Main method of the example. Writes a message to the console with the actual
     * date
     */
    @Override
    public void run() {
        System.out.printf("%s: Executed at: %s\n",name,new Date());
    }

}