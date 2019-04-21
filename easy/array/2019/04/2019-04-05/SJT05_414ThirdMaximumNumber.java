package com.jt.easy.array.d201904;
/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum. 
*/
public class SJT05_414ThirdMaximumNumber
{
    public int thirdMax(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        int len = nums.length;
        long fMax=Long.MIN_VALUE,sMax=Long.MIN_VALUE,tMax=Long.MIN_VALUE;
        for(int i=0; i<len; i++)
        {
            if(nums[i]>fMax)
            {
                tMax=sMax;
                sMax=fMax;
                fMax=nums[i];
            }
            else if(nums[i]>sMax && nums[i]<fMax)
            {
                tMax=sMax;
                sMax=nums[i];
            }                
            else if(nums[i]>tMax && nums[i]<sMax)
            {
                tMax=nums[i];
            }               
        }
        return (tMax==Long.MIN_VALUE || tMax==sMax) ? (int)fMax : (int)tMax;//err1:第三大的值可能是Integer.MIN_VALUE;
    }
}
/*

*/