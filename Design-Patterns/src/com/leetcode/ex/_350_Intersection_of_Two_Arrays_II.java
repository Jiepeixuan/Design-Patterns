package com.leetcode.ex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _350_Intersection_of_Two_Arrays_II {

    public int[] intersect(int[] nums1, int[] nums2) {

        int len1 = nums1.length, len2 = nums2.length;

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        for (int i : nums1)
            list1.add(i);

        for (int i = 0; i < len2; i++) {
            if (list1.contains(nums2[i])) {
                list2.add(nums2[i]);
                list1.remove(list1.indexOf(nums2[i]));
            }
        }

        int[] ret = new int[list2.size()];
        int cnt = 0;
        for(int num:list2) {
            ret[cnt++] = num;
        }

        return ret;

    }
}
