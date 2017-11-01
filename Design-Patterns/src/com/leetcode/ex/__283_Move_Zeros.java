package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __283_Move_Zeros {

    /**
     *
     * @deprecated
     *              Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
     *
     *          将所有的非0的前移 后面数字全置为0
     *
     * @param num
     */

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
