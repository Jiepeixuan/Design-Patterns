package com.thinkin.java.ch21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by peixuan.xie on 2017/7/26.
 */
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i =0; i < 5; i++)
            executorService.execute(new LiftOff());
        executorService.shutdown();
    }
}
