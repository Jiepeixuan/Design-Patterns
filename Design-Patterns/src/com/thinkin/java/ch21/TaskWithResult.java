package com.thinkin.java.ch21;

import java.util.concurrent.Callable;

/**
 * Created by peixuan.xie on 2017/7/26.
 */
public class TaskWithResult implements Callable<String>{

    private int id;

    public TaskWithResult(int id){
        this.id=id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
