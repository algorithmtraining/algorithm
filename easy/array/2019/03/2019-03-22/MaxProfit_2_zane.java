public class MaxProfit_2_zane {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] pricess = {6, 1, 3, 2, 4, 7};
        int[] pricesss = {1, 7, 2, 3, 6, 7, 6, 7};
        System.out.println(maxProfit(pricesss));
    }


    public static int cal(int[] prices) {

        int low = 0;
        int peak = 0;
        int totalProfit = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            low = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }

            peak = prices[i];

            totalProfit += peak - low;
        }

        return totalProfit;
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
