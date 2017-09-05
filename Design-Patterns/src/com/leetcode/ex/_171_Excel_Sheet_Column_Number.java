package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum = 26 * sum + s.charAt(i) - 'A' + 1;
        return sum;
    }
}
