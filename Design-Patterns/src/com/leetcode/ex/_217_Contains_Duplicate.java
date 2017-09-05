package com.leetcode.ex;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _217_Contains_Duplicate {

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
