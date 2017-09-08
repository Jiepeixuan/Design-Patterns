package com.thinkin.java.ch13;

import com.thinkin.java.Logger;

import java.util.Arrays;

/**
 * Created by peixuan.xie on 2017/9/8.
 */
public class CopyingArrays {

    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        Logger.print("i=" + Arrays.toString(i));
        Logger.print("j=" + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        Logger.print("j=" + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        Logger.print("k=" + Arrays.toString(k));
        Arrays.fill(k, 103);
        System.arraycopy(k, 0, i, 0, k.length);
        Logger.print("i=" + Arrays.toString(i));
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));
        Logger.print("u=" + Arrays.toString(u));
        Logger.print("v=" + Arrays.toString(v));
        System.arraycopy(v, 0, u, u.length / 2, v.length);
        Logger.print("u=" + Arrays.toString(u));
    }

}
