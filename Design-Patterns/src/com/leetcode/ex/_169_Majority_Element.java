package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _169_Majority_Element {

    public int majorityElement(int[] nums) {
        int element = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else {
                if (element == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return element;
    }
}
