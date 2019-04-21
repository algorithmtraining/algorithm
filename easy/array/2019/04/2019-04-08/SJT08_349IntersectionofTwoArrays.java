package com.jt.easy.array.d201904;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/
public class SJT08_349IntersectionofTwoArrays
{
	public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0) return new int[0]; //err1 此处直接返回null了       
        Set<Integer> set1 = new HashSet<Integer>();
        for(int num:nums1)
            set1.add(num);
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num:nums2)
            if(set1.contains(num))
                set2.add(num);
        int[] result = new int[set2.size()];
        int i=0;
        for(int n : set2)
        {
            result[i++]=n;
        }
        return result;
        //Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(nums1));
        //Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(nums2));
        //int[] result = new int[nums1.length<=nums2.length?nums1.length:nums2.length];
        //return set1.retainAll(set2).toArray(result);
    }
	public int[] intersection2() {//int[] nums1, int[] nums2
        //if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0) return new int[0]; //err1 此处直接返回null了       
        int[] nums1 = {1,2,4};
		int[] nums2 = {1,2,3};
		List list = new ArrayList();
		list = Arrays.asList(nums1);
		Set<Integer> set1 = new HashSet<Integer>(list);
        Set<Integer> set2 = new HashSet<Integer>((List)Arrays.asList(nums2));
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        //return set1.toArray();
        //return set1.toArray(result);        
        return null;
    }
	public static void main(String[] args)
	{
		
	}
}
/*

*/