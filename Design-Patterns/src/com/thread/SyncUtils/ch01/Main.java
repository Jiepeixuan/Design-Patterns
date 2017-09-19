package com.thread.SyncUtils.ch01;

/**
 * Created by peixuan.xie on 2017/9/19.
 */
public class Main {

    public static void main(String[] args) {
        PrintQueue printQueue=new PrintQueue();
        Thread thread[]=new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i]=new Thread(new Job(printQueue),"Thread"+i);
        }

        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }
}
