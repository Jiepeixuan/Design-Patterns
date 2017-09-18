package com.thread.ThreadLocalVariable;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Main {
    public static void main(String[] args) {
        // Creates the unsafe task
        UnsafeTask task = new UnsafeTask();

        // Throw three Thread objects
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
