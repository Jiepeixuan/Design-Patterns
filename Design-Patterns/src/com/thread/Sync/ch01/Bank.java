package com.thread.Sync.ch01;

import com.thread.Sync.ch01.Account;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Bank implements Runnable {

    /**
     * The account affected by the operations
     */
    private Account account;

    /**
     * Constructor of the class. Initializes the account
     * @param account The account affected by the operations
     */
    public Bank(Account account) {
        this.account=account;
    }

    /**
     * Core method of the Runnable
     */
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println("Bank"+account.getBalance());
            account.subtractAmount(1000);
        }
    }

}
