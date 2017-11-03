package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __387_First_Unique_Character_in_a_String {

    /**
     *  Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     *  Examples:

            s = "leetcode"
            return 0.

            s = "loveleetcode",
            return 2.
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        int tmp[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            tmp[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (tmp[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
