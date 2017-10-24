package com.thread.Synchronized;

/**
 * Created by peixuan.xie on 2017/10/23.
 */
public class Counter implements Runnable {

    private int count;

    public Counter() {
        count = 0;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if ("A".equals(threadName)) {
            countAdd();
        } else if ("B".equals(threadName)) {
            printCount();
        }

    }

    private void printCount() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " count:" + count);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void countAdd() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(counter, "A");
        Thread thread1 = new Thread(counter, "B");
        thread.start();
        thread1.start();
    }
}
