package com.jt.easy.array.d201904;
/*
Given an array containing n distinct numbers taken from 
0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?
*/
public class SJT01H_268MissingNumber
{
    public int missingNumber(int[] nums)
    {
        if(nums==null || nums.length==0) return -1;
        //利用异或的性质：和自身异或为0（相同的数的异或为0），0与任何数异或还是原来的数；
        //那么我们将数组中的数与0...n异或，有相同的数则消去；最后剩下那个即为所求
        int XOR = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            XOR ^= (i^nums[i]);
        }
        return XOR;
    }
    public int missingNumber1(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        int expected = nums.length*(nums.length+1)/2;//如果都不缺，0+1+2+3+...+n=expected
        int result=0;
        for(int num:nums)
            result += num;//缺的那个数没有被加进来
        return expected-result;
    }
}
/*

*/