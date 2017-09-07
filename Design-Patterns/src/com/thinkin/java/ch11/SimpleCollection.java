package com.thinkin.java.ch11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (Integer i : collection) {
            System.out.println(i + "");
        }
    }

}
