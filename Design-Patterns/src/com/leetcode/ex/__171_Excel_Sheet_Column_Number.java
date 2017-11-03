package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __171_Excel_Sheet_Column_Number {

    /**
     *  A -> 1
     B -> 2
     C -> 3
     ...
     Z -> 26
     AA -> 27
     AB -> 28
     * @param s
     * @return
     */

    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum = 26 * sum + s.charAt(i) - 'A' + 1;
        return sum;
    }
}
