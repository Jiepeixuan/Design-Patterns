package com.thinkin.java.ch21;

/**
 * Created by peixuan.xie on 2017/10/24.
 */
public abstract class IntGenerator {

    private volatile boolean cancele = false;

    public abstract int next();

    public void cancel() {
        cancele = true;
    }

    public boolean isCanceled() {
        return cancele;
    }
}
