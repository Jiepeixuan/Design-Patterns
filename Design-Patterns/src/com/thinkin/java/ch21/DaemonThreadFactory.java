package com.thinkin.java.ch21;

import java.util.concurrent.ThreadFactory;

/**
 * Created by peixuan.xie on 2017/10/24.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {

        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
