package com.thread.Sync.ch01;

import com.thread.Sync.ch01.Account;

/**
 * Created by peixuan.xie on 2017/9/18.
 */
public class Company implements Runnable {

    /**
     * The account affected by the operations
     */
    private Account account;

    /**
     * Constructor of the class. Initializes the account
     * @param account the account affected by the operations
     */
    public Company(Account account) {
        this.account=account;
    }

    /**
     * Core method of the Runnable
     */
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println("Company"+account.getBalance());
            account.addAmount(1000);
        }
    }

}
