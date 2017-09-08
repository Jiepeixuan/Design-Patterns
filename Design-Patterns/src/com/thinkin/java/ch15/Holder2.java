package com.thinkin.java.ch15;

/**
 * Created by peixuan.xie on 2017/9/8.
 */
public class Holder2 {

    private Object object;

    public Holder2(Object object) {
        this.object = object;
    }

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.get();
        holder2.set("test");
        String s = (String) holder2.get();
        holder2.set(1);
        Integer integer = (Integer) holder2.get();
    }

}
