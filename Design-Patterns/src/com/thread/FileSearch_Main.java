package com.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class FileSearch_Main {
    public static void main(String[] args) {
        FileSearch searcher = new FileSearch("D:\\", "autoexec.bat");
        Thread thread = new Thread(searcher);

        // Starts the Thread
        thread.start();

        // Wait for ten seconds
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupts the thread
        thread.interrupt();
    }
}
