package com.thinkin.java.ch15;

/**
 * Created by peixuan.xie on 2017/9/8.
 */
public class Holder3<T> {

    private T t;

    public Holder3(T a) {
        t = a;
    }

    public void set(T a) {
        t = a;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());
        Automobile automobile=holder3.get();
    }

}
