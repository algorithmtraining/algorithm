package com.jt.easy.array.d201903;
public class SJT13_35SearchInsertPosition
{
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        return findInsert(nums, 0, nums.length-1 ,target);              
    }
    int findInsert(int[] nums,int b, int e, int target)
    {
        if(b>e) return e+1;//big 与end 只有一个在变;查找玩，没找到target，
        int mid = (b+e)/2;        
        if(nums[mid] < target)
            return findInsert(nums, mid+1, e,target);
        else if(nums[mid] > target)
            return findInsert(nums, b, mid-1,target);
        return mid;//(nums[mid]==target) 
    }
}
/*
Given a sorted array and a target value, 
return the index if the target is found. 
If not, 
return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
*/