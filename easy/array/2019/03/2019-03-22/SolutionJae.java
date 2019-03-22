public class SolutionJae{
    // 局部最优解即为全局最优解
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int minPrice = prices[0];
        int maxPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] < prices[i-1]){
                // 计算局部最大利润
                maxProfit += maxPrice > minPrice ? maxPrice - minPrice : 0;
                // 刷新买入&卖出价
                minPrice = prices[i];
                maxPrice = prices[i];
            }else if (prices[i] >= prices[i-1]){
                // 刷新卖出价
                maxPrice = prices[i];
            }
        }

        maxProfit += maxPrice > minPrice ? maxPrice - minPrice:0;
        return maxProfit;
    }
}
