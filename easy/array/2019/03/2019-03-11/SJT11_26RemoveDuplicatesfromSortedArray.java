package com.jt.easy.array.d201903;
/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
Example 2:
Given nums = [0,0,1,1,1,2,2,3,3,4],
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.
*/
//AC 5ms 41.9MB??? java
public class SJT11_26RemoveDuplicatesfromSortedArray {
	//思路：遍历数组，用lastIndex记录最近遍历的不一样的元素的索引位置；当前值与last不同，不用个数（去重后元素的个数）加一，索引加一；相同，查找下一个不同元素
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;//error1 没有元素不一定就是null
        if(nums.length == 1) return 1;
        int lastIndex = 0;
        int size=1;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[lastIndex])//error2,没认真读题，要将数组去重，不是只找出不同元素个数
            {
                size++;
                //找出不同后，腾位置，新元素插到后面
                lastIndex++;
                nums[lastIndex]=nums[i];
            }              
        }
        return size;
    }
}