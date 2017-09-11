package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class _172_Factorial_Trailing_Zeroes {

    public int trailingZeroes(int n) {

        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}
