package com.thread.ThreadLocalVariable;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class SafeMain {

    public static void main(String[] args) {
        // Creates a task
        SafeTask task=new SafeTask();

        // Creates and start three Thread objects for that Task
        for (int i=0; i<3; i++){
            Thread thread=new Thread(task);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.start();
        }

    }
}
