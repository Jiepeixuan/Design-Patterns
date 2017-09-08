package com.thinkin.java.ch17;

/**
 * Created by peixuan.xie on 2017/9/8.
 */
public class StringAddress {

    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
