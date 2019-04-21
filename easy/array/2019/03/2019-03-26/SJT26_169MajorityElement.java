package com.jt.easy.array.d201903;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/
public class SJT26_169MajorityElement
{
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.get(nums[i])==null)
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
            if(map.get(nums[i]) > nums.length/2)
                return nums[i];
        }
        return 0;
    }
    public static void main(String[] args)
	{
    	SJT26_169MajorityElement majorityElement = new SJT26_169MajorityElement();
    	System.out.println(majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
	}   
}
/*
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
*/