package com.pattern.design.Adapter;

/**
 * Created by peixuan.xie on 2017/9/21.
 */
interface ScoreOperation {
    public int[] sort(int array[]);
    public int search(int array[],int key); //成绩查找
}
