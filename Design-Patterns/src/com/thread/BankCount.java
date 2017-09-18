package com.thread;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class BankCount {
    private int count=0;//余额

    public synchronized void addMoney(int money){
        count += money;
        System.out.println(System.currentTimeMillis() + "存入：" + money);
        System.out.println("账户余额：" + count);
    }

    public synchronized void getMoney(int money){
        if(count - money < 0){
            System.out.println("余额不足");
            System.out.println("账户余额：" + count);
            return;
        }
        count -= money;
        System.out.println(System.currentTimeMillis() + "取出：" + money);
        System.out.println("账户余额：" + count);
    }
}
