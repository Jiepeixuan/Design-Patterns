package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _242_Vaild_Anagram {

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
