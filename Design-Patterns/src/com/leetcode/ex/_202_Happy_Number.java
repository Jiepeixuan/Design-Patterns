package com.leetcode.ex;

import java.util.HashSet;
import java.util.Set;


public class _202_Happy_Number {


    /**
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        if (n < 0)
            return false;
        Set<Integer> set = new HashSet<>();
        int tmp;
        int newN;
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            newN = 0;
            while (n > 0) {
                tmp = n % 10;
                n /= 10;
                newN += tmp * tmp;
            }
            n = newN;
        }
        return n == 1;
    }
}
