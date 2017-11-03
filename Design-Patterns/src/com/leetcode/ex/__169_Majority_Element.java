package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __169_Majority_Element {

    /**
     *
     * @deprecated
     *              Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

                    You may assume that the array is non-empty and the majority element always exist in the array.
     * @param nums
     * @return
     */

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
