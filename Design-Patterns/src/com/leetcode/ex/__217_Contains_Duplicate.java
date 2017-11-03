package com.leetcode.ex;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __217_Contains_Duplicate {

    /**
     * @param nums
     * @return
     * @deprecated Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     * <p>
     * 判断list 是否包含重复数据
     */

    public boolean containsDuplicate(int[] nums) {

        if (nums != null && nums.length > 0) {
            Set<Integer> set = new HashSet<>();
            for (int i : nums) {
                if (set.contains(i)) {
                    return true;
                } else {
                    set.add(i);
                }
            }
        }
        return false;
    }
}
