package com.jt.easy.array.d201903;

public class SJT14H_53MaximumSubarray
{
	//分治
    //分：数组一分两半（可再分）；最大子序列可能在左半部分，也可能在右半部分，也可能横跨左右两部分
    //治：找出左半边lmax、右半边rmax、横跨左右两部分mmax 这三种情况下的最大值 ，比较三个值大小，取最大。
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        return findMaxSubArr(nums,0,nums.length-1);
    }
    int findMaxSubArr(int[] nums, int l, int r)
    {
        if(l==r) return nums[l];//递归出口（不能再分）
        int m = (l+r)/2;
        int lmax = findMaxSubArr(nums,l,m);
        int rmax = findMaxSubArr(nums,m+1,r);
        int mmax = nums[m];
        int sum = mmax;
        for(int i=m-1; i>=l; i--)
        {
            sum += nums[i];
            mmax = Math.max(sum,mmax);
        }
        sum = mmax;
        for(int i=m+1; i<=r; i++)
        {
            sum += nums[i];
            mmax = Math.max(sum,mmax);
        }
        return Math.max(mmax,Math.max(lmax,rmax));
    }
}
/*
 // Version 1: Greedy

public class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        //max记录全局最大值，sum记录区间和，如果当前sum>0，那么可以继续和后面的数求和，否则就从0开始
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}

// Version 2: Prefix Sum

public class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        //max记录全局最大值，sum记录前i个数的和，minSum记录前i个数中0-k的最小值
        int max = Integer.MIN_VALUE, sum = 0, minSum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum - minSum);
            minSum = Math.min(minSum, sum);
        }

        return max;
    }
}

 */
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/