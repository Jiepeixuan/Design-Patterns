package com.thinkin.java.ch11;

import com.thinkin.java.Logger;

import java.util.*;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class PrintingContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","1");
        map.put("cat","2");
        map.put("dog","3");
        map.put("dog","4");
        return map;
    }

    public static void main(String[] args) {
        Logger.print(fill(new ArrayList<String>()));
        Logger.print(fill(new LinkedList<String>()));
        Logger.print(fill(new HashSet<String>()));
        Logger.print(fill(new TreeSet<String>()));
        Logger.print(fill(new LinkedHashSet<String>()));
        Logger.print(fill(new HashMap<String, String>()));
        Logger.print(fill(new TreeMap<String, String>()));
        Logger.print(fill(new LinkedHashMap<String, String>()));
    }

}
