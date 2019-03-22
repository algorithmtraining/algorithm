public class MaxProfit_1_zane {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] pricess = {};
        System.out.println(maxProfit(pricess));
    }

    /**
     * NO.121.一次遍历，用时2ms.
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {


        int profit = 0;
        int maxProfit = 0;
        if (prices.length <= 0) {
            return maxProfit;
        }
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                profit = prices[i] - min;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

}
