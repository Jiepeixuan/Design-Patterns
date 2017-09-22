package com.thread.Executor.ch05;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/22.
 */
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executor=(ScheduledExecutorService)Executors.newScheduledThreadPool(1);

        System.out.printf("Main: Starting at: %s\n",new Date());

        // Send the tasks to the executor with the specified delay
        for (int i=0; i<5; i++) {
            Task task=new Task("Task "+i);
            executor.schedule(task,i+1 , TimeUnit.SECONDS);
        }

        // Finish the executor
        executor.shutdown();

        // Waits for the finalization of the executor
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Writes the finalization message
        System.out.printf("Core: Ends at: %s\n",new Date());
    }
}
