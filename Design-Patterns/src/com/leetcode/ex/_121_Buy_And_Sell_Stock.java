package com.leetcode.ex;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _121_Buy_And_Sell_Stock {

    public int maxProfit(int[] prices) {

        int curPro = 0, resPro = 0;
        for (int i = 1; i < prices.length; i++) {
            curPro=Math.max(0,curPro+prices[i]-prices[i-1]);
            resPro=Math.max(curPro,resPro);
        }

        return resPro;
    }
}
