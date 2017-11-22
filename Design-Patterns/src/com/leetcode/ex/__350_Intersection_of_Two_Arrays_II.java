package com.leetcode.ex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __350_Intersection_of_Two_Arrays_II {

    /**
     *
     * Given two arrays, write a function to compute their intersection.

     Example:
     Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

     Note:
     Each element in the result should appear as many times as it shows in both arrays.
     The result can be in any order.
     Follow up:
     What if the given array is already sorted? How would you optimize your algorithm?
     What if nums1's size is small compared to nums2's size? Which algorithm is better?
     What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     * @param nums1
     * @param nums2
     * @return
     */
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
