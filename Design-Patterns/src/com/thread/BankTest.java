package com.thread;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class BankTest {

    public static void main(String[] args) {
        final BankCount bankCount = new BankCount();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    bankCount.getMoney(200);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    bankCount.addMoney(200);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
