package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/6.
 */
public class _326_Power_of_Three {

    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }

}
