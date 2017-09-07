package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class _53_Maximum_Subarray {

    /**
     *
     * 采用动态规划法，使用local去维持一个局部的变量，使用global去维持一个全局变量
     *
     * @param nums
     * @return
     */

    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int global = nums[0];
        int local = nums[0];
        for (int i = 1; i < nums.length; i++) {
            local=Math.max(nums[i],local+nums[i]);
            global=Math.max(local,global);
        }
        return global;
    }

    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i += 1) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }

            max = Math.max(max, sum);
        }

        return max;
    }

}
