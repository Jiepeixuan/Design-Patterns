package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/6.
 */
public class _268_Missing_Number {

    /*
    *
    * a^b^b =a
    * 做异或运算  对所有的i和i对应的数组值做异或运算 剩下的则为需要的
    *
    * */

    public int missingNumber(int[] nums) {
        if (nums == null)
            return 0;
        int res = 0, i = 0;

        for (i = 0; i < nums.length; i++)
            res ^= nums[i] ^ i;

        return res ^ i;
    }

}
