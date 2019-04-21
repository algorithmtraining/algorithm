package com.jt.easy.array.d201904;
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
*/
public class SJT03_198HouseRobber
{
    //设dp[i]为到位置i时，抢劫到的最大值；dp[i] = max{dp[i-2]+nums[i],dp[i-1]};
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++)
        {
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
/*
http://www.cnblogs.com/grandyang/p/4383632.html
class Solution {
public:
    int rob(vector<int> &nums) {
        int robEven = 0, robOdd = 0, n = nums.size();
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                robEven = max(robEven + nums[i], robOdd);
            } else {
                robOdd = max(robEven, robOdd + nums[i]);
            }
        }
        return max(robEven, robOdd);
    }
};
*/