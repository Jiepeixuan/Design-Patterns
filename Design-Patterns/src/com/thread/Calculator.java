package com.thread;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Calculator implements Runnable{

    private int number;

    public Calculator(int number){
        this.number=number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%s : %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
        }
    }
}
