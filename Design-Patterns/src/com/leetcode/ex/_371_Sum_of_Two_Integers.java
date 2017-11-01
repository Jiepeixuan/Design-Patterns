package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/11/1.
 */
public class _371_Sum_of_Two_Integers {


    /**
     * @param a
     * @param b
     * @return
     * @deprecated Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
     * <p>
     * 使用二进制运算 使用异或获取低位不同的参数  使用与运算获取
     */

    public int getSum(int a, int b) {
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }

}
