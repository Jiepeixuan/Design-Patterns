package com.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class FileClock implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n", new Date());
            try {
                // Sleep during one second
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("The FileClock has been interrupted\n");
            }
        }
    }

}
