package com.jt.easy.array.d201904;

import java.util.Arrays;

/*
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
*/
//由于我们要最大化每对中的较小值之和，
//那么肯定是每对中两个数字大小越接近越好，
//因为如果差距过大，而我们只取较小的数字，那么大数字就浪费掉了。
public class SJT12_561ArrayPartion1
{
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; 2*i<nums.length; i++)
        {
            sum+=nums[2*i];
        }
        return sum;
    }
}
/*
Runtime: 15 ms, faster than 82.28% of Java online submissions for Array Partition I.
Memory Usage: 41.9 MB, less than 37.01% of Java online submissions for Array Partition I.
*/