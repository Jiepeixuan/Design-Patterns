package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __242_Vaild_Anagram {

    /**
     * @deprecated
     *              Given two strings s and t, write a function to determine if t is an anagram of s.

                    For example,
                        s = "anagram", t = "nagaram", return true.
                        s = "rat", t = "car", return false.

                    解答方案类似387 使用int数组将String 按照字母拆分放进去，然后进行比较
     * @param s
     * @param t
     * @return
     */

    public boolean isAnagram(String s, String t) {

        int[] tmp = new int[26];

        for (int i = 0; i < s.length(); i++)
            tmp[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            tmp[t.charAt(i) - 'a']--;
        for (int i : tmp)
            if (i != 0)
                return false;

        return true;
    }
}
