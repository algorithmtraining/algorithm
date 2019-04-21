package com.jt.easy.array.d201903;
/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/
public class SJT29_219ContainsDuplicate2
{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length==0) return false;
        for(int j=1;j<=k;j++)
        {
            for(int i=0; i+j<nums.length;i++)
                if(nums[i]==nums[i+j])
                   return true;
        }       
        return false;
    }
    /*
     Runtime: 940 ms, faster than 5.01% of Java online submissions for Contains Duplicate II.
Memory Usage: 41.6 MB, less than 67.81% of Java online submissions for Contains Duplicate II.
Next challenges:
     */
}
/*

*/