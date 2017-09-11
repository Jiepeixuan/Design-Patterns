package com.thinkin.java.ch21;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class LiftOff implements Runnable {

    protected int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount++;

    public LiftOff() {

    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    @Override
    public void run() {
        while ((countDown-- > 0)) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
