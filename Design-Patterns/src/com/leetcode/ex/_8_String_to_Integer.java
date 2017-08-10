package com.leetcode.ex;

public class _8_String_to_Integer {

    public int stringToInteger(String s) {
        if (s == null || s.length() == 0)
            return 0;

        s = s.trim();

        boolean positive = true;
        int i = 0;
        if (s.charAt(0) == '+') {
            positive = true;
            i++;
        } else if (s.charAt(0) == '-') {
            positive = false;
            i++;
        }

        double temp = 0;
        for (; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit < 0 || digit > 9)
                break;
            if (positive) {
                temp = temp * 10 + digit;
                if (temp > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            } else {
                temp = temp * 10 - digit;
                if (temp < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }

        }

        return (int) temp;
    }
}
