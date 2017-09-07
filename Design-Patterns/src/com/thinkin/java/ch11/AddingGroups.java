package com.thinkin.java.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] integers={6,7,8,9,10};
        collection.addAll(Arrays.asList(integers));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,integers);
        for (Integer i : collection) {
            System.out.println(i + "");
        }
    }
}
