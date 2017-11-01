package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/11/1.
 */
public class _238_Product_of_Array_Except_Self {

    /**
     *
     * @deprecated
     *              Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

                    Solve it without division and in O(n).

                    For example, given [1,2,3,4], return [24,12,8,6].

                    [1, a1, a1*a2, a1*a2*a3]
                    [a2*a3*a4, a3*a4, a4, 1]
                    res=[a2*a3*a4, a1*a3*a4, a1*a2*a4, a2*a3*a4]
     * @param nums
     * @return
     */


    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] pSeq = new int[nums.length];
        int[] nSeq = new int[nums.length];

        pSeq[0] = 1;
        for (int i = 1; i < len; i++) {
            pSeq[i] = pSeq[i - 1] * nums[i - 1];
        }

        nSeq[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            nSeq[i] = nSeq[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            pSeq[i] *= nSeq[i];
        }

        return pSeq;
    }

}
