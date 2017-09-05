package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _122_Buy_And_Sell_Stock_2 {

    public int maxProfit(int[] prices) {

        int res = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1])
                res += prices[i + 1] - prices[i];
        }
        return res;
    }
}
