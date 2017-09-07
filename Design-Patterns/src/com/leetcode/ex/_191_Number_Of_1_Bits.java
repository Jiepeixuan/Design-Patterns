package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class _191_Number_Of_1_Bits {

    public int hammingWeight(int n) {

        int total = 0;
        while (n != 0) {
            total++;
            n = n & (n - 1);
        }
        return total;
    }
}
