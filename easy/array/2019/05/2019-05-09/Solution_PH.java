class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costlength = cost.length;
        int dp [] = new int[costlength];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i =2;i<costlength;i++)
        {
            int corretn = cost[i];
            dp[i] = Math.min(dp[i-1],dp[i-2])+corretn;
        }
        return Math.min(dp[costlength-1],dp[costlength-2] ) ;
    }
}
