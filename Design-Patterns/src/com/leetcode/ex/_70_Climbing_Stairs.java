package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/6.
 */
public class _70_Climbing_Stairs {

    public int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 1)
            return 1;
        int[] step = new int[n];
        step[0] = 1;
        step[1] = 2;
        for (int i = 2; i < n; i++) {
            step[i] = step[i - 1] + step[i - 2];
        }
        return step[n - 1];
    }

}
