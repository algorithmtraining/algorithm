public class SolutionJae{
    // 只需要關注最低賣出價格即可
    public int maxProfit2 int[] prices) {
        int minPrice = Integer.MAC_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice =  prices[i];
            }else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }else {}
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }

        int buy = prices[0];
        int sale = prices[prices.length - 1];
        int profit = 0;

        for (int i = 1; i < prices.length; i++){
            // 可買點
            if (prices[i] <= prices[i - 1] && prices[i] < buy){
                // 計算前面的利潤,刷新售出最低點
                profit = Math.max(profit, sale >= buy? sale - buy : 0);
                buy = prices[i];
                sale = buy;
            } else if (prices[i] >= prices[i - 1] && prices[i] > sale){
                // 刷新可賣點
                sale = prices[i];
            }
        }
        return Math.max(profit, sale >= buy? sale - buy : 0);
    }
}
