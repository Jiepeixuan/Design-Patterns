package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/1.
 */
public class _136_Single_Number {

    public int signleNumber(int[] nums) {
        int ans = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
