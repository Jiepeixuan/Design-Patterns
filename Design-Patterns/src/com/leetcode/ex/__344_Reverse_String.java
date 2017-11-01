package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/1.
 */
public class __344_Reverse_String {

    /**
     * @deprecated :
     *              Given s = "hello", return "olleh".
     * @param s
     * @return
     */

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
        return new String(chars);
    }

}
