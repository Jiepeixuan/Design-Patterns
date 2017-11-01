package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/1.
 */
public class __136_Single_Number {

    /**
     * @deprecated
     *              Given an array of integers, every element appears twice except for one. Find that single one.
     *
     *              使用异或
     *
     *              0^3=3 3^3=0
     * @param nums
     * @return
     */

    public int signleNumber(int[] nums) {
        int ans = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
