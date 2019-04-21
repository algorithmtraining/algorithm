class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0)
        {
            return 0;
        }
        int buyprice = prices[0];
        for(int i = 1;i<prices.length;i++)
        {
            if(prices[i] > buyprice)
            {
                profit  = profit + prices[i] - buyprice;
                buyprice = prices[i];
            }
            else {
                buyprice = prices[i];
            }
        }
    return profit;
    }    
}
