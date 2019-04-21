package com.jt.easy.array.d201904;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
Note:
The pairs (i, j) and (j, i) count as the same pair.
The length of the array won't exceed 10,000.
All the integers in the given input belong to the range: [-1e7, 1e7].
*/
public class SJT11_532KdiffPairsinanArray
{
	public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) return 0; //err1,绝对差值不可能小于0；Input: [1,2,3,4,5] -1 ;Expected:0
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        for(int num : nums)
        {
        	if(k==0 && (map.get(num)!=null && map.get(num)==1))//目标对象存在(跟自己相等)，且只出现一次；
        	{
        		result++;
        		map.put(num,2);//已经成对
        		continue;
        	}        		
        	if(map.get(num+k)!=null && map.get(num)==null)//目标存在，只差自己不在,即map中还没有存储这对
        		result++;//个数++
        	if(map.get(num-k)!=null && map.get(num)==null)//目标存在，只差自己不在,即map中还没有存储这对
        		result++;//个数++ 
        	if(map.get(num)==null)//err2:少了此判断，通不过kdiffPairsinanArray.findPairs(new int[] {1,1,1,1,1}, 0);
        		map.put(num,1);//此时map中已存在num，其目标对象之前存在过，就构成了一对pair了
        }
        return result;
    }
	public static void main(String[] args)
	{
		SJT11_532KdiffPairsinanArray kdiffPairsinanArray = new SJT11_532KdiffPairsinanArray();
		//System.out.println(kdiffPairsinanArray.findPairs(new int[] {3,1,4,1,5}, 2));
		//System.out.println(kdiffPairsinanArray.findPairs(new int[] {1,3,1,5,4}, 0));
		//System.out.println(kdiffPairsinanArray.findPairs(new int[] {1,2,3,4,5}, 1));
		System.out.println(kdiffPairsinanArray.findPairs(new int[] {1,1,1,1,1}, 0));
	}
}
/*
err2
Runtime: 10 ms, faster than 91.78% of Java online submissions for K-diff Pairs in an Array.
Memory Usage: 40.3 MB, less than 57.51% of Java online submissions for K-diff Pairs in an Array.
*/