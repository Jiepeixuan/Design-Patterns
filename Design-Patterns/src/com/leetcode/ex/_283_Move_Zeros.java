package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _283_Move_Zeros {

    public void moveZeros(int[] num) {
        int newIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0)
                num[newIndex++] = num[i];
        }

        for (; newIndex < num.length; newIndex++)
            num[newIndex] = 0;
    }
}
