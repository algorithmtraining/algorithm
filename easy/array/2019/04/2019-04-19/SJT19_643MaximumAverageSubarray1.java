package com.jt.easy.array.d201904;
/*
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 

Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
*/
public class SJT19_643MaximumAverageSubarray1
{
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0,tempSum=0;
        for(int i=0; i<k; i++)        
        	tempSum+=nums[i];        
        maxSum=tempSum;
        for(int i=k; i<nums.length;i++)
        {
            tempSum = tempSum+nums[i]-nums[i-k];
            if(tempSum>maxSum)
                maxSum=tempSum;
        }
        return maxSum/k;
    }
    public static void main(String[] args)
	{
    	SJT19_643MaximumAverageSubarray1 averageSubarray1 = new SJT19_643MaximumAverageSubarray1();
    	System.out.println(averageSubarray1.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
	}
}
/*
Runtime: 3 ms, faster than 99.10% of Java online submissions for Maximum Average Subarray I.
Memory Usage: 43 MB, less than 43.29% of Java online submissions for Maximum Average Subarray I.
*/