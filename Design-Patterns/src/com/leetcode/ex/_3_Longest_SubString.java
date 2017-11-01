package com.leetcode.ex;


import java.util.HashMap;

public class _3_Longest_SubString {

    /**
     *
     *
     *  Given a string, find the length of the longest substring without repeating characters.
        Examples:
        Given "abcabcbb", the answer is "abc", which the length is 3.
        Given "bbbbb", the answer is "b", with the length of 1.
        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     *
     * @param s
     * @return
     */

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int leftBound = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            leftBound = Math.max(leftBound, (map.containsKey(c)) ? map.get(c) + 1 : 0);
            max = Math.max(max, i - leftBound + 1);
            map.put(c, i);
        }
        return max;
    }
}
