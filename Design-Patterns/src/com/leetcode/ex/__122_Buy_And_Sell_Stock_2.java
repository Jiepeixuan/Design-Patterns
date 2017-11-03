package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __122_Buy_And_Sell_Stock_2 {

    /**
     * @deprecated
     *
     *      多次买卖  求最大收益
     *
    Say you have an array for which the ith element is the price of a given stock on day i.

    Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1])
                res += prices[i + 1] - prices[i];
        }
        return res;
    }
}
