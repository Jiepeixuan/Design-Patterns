package com.thread.SyncUtils.ch04;

/**
 * Created by peixuan.xie on 2017/9/19.
 */
public class Results {

    private int data[];

    /**
     * Constructor of the class. Initializes its attributes
     * @param size Size of the array to store the results
     */
    public Results(int size){
        data=new int[size];
    }

    /**
     * Sets the value of one position in the array of results
     * @param position Position in the array
     * @param value Value to set in that position
     */
    public void  setData(int position, int value){
        data[position]=value;
    }

    /**
     * Returns the array of results
     * @return the array of results
     */
    public int[] getData(){
        return data;
    }

}
