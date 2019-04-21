package com.jt.easy.array.d201903;

import java.util.HashSet;
import java.util.Set;

/*

*/
public class SJT28_217ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++)
            if(set.add(nums[i]) == false)//set中已存在
                return true;
        return false;
    }
    public static void main(String[] args)
	{
    	SJT28_217ContainsDuplicate containsDuplicate = new SJT28_217ContainsDuplicate();
    	System.out.println(containsDuplicate.containsDuplicate(new int[] {1,2,3,1}));
	}
}
/*

*/