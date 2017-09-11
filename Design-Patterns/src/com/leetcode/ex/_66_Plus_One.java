package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class _66_Plus_One {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;

    }

}
