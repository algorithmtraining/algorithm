package com.jt.easy.array.d201903;
/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/


public class SJT21_121BestTimetoBuyandSellStock
{
	// We need to find the largest peak following the smallest valley
    public int maxProfit2(int[] prices) {
        if(prices==null || prices.length<=1) return 0;
        int profit=0;
        int minGu=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < minGu)
                minGu = prices[i];
            profit = Math.max(profit, prices[i]-minGu);
        }
        return profit;
    }
    //暴力枚举峰与谷
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1) return 0;
        int profit=0;
        for(int i=1; i<prices.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                profit = Math.max(profit,prices[i]-prices[j]);
            }
        }
        return profit;
    }
}
/*
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
*/