package com.thinkin.java.ch21;

/**
 * Created by peixuan.xie on 2017/10/24.
 */
public class EvenGenerator extends IntGenerator {

    private int currentEventValue = 0;

    @Override
    public int next() {
        ++currentEventValue;
        ++currentEventValue;
        return currentEventValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
