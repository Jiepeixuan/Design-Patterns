package com.leetcode.ex;

public class _7_Reverse_Integer {

    public int reverseInteger(int x) {
        long result = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            result *= 10;
            result += temp % 10;
            if (result > Integer.MAX_VALUE)
                return 0;
            temp /= 10;
        }
        return (int) (x > 0 ? result : -result);
    }

}
