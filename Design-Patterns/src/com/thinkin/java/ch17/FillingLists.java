package com.thinkin.java.ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by peixuan.xie on 2017/9/8.
 */
public class FillingLists {

    public static void main(String[] args) {
        List<StringAddress> list= new ArrayList<StringAddress>(
                Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("World!"));
        System.out.println(list);
    }

}
