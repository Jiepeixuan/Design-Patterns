package com.thinkin.java.ch21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++)
            executorService.execute(new LiftOff());
        executorService.shutdown();
    }
}
