/*
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps.
You need to find minimum cost to reach the top of the floor,
 and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
Note:
cost will have a length in the range [2, 1000].
Every cost[i] will be an integer in the range [0, 999].
 */
/*
    public int minCostClimbingStairs(int[] cost) {
        return getICost(cost,cost.length);
    }
    int getICost(int[] cost,int i){
        //跳到0或1不费代价
        if(i<=1)
            return 0;
        //到i位置一共付出的代价为：min(到i-1位置的代价+从i-1起跳代价,到i-2的代价+从i-2位上起跳的代价)
        //因为要么一步上去，要么两步上去。我贪心选择最不费力气的那种方式。
        return Math.min(getICost(cost,i-1)+cost[i-1],getICost(cost,i-2)+cost[i-2]);
    }
    */
public class SJT_746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] atIcost = new int[cost.length+1];
        atIcost[0]=0;
        atIcost[1]=0;
        for(int i=2; i<=cost.length;i++)
        {
            atIcost[i] = Math.min(atIcost[i-1]+cost[i-1], atIcost[i-2]+cost[i-2]);
        }
        return atIcost[cost.length];
    }
}
/*
可以优化，不用开那么大的数组。
Runtime: 1 ms, faster than 99.86% of Java online submissions for Min Cost Climbing Stairs.
Memory Usage: 41.5 MB, less than 8.08% of Java online submissions for Min Cost Climbing Stairs.
 */