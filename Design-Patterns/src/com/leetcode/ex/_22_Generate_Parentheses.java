package com.leetcode.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/11/3.
 */
public class _22_Generate_Parentheses {


    /**
     * @param n
     * @return
     * @deprecated Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * <p>
     * For example, given n = 3, a solution set is:
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     */

    public List<String> generateParentheses(int n) {
        List<String> res = new ArrayList<>();
        if (n < 0)
            return res;
        helper(n, n, new String(), res);
        return res;
    }

    private void helper(int left, int right, String s, List<String> res) {
        if (right < left)
            return;
        if (left == 0 && right == 0)
            res.add(s);
        if (left > 0)
            helper(left - 1, right, s + "(", res);
        if (right > 0)
            helper(left, right - 1, s + ")", res);

    }

}
