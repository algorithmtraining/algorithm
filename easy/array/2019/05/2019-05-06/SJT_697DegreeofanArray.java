/*
Given a non-empty array of non-negative integers nums,
the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 that has the same degree as nums.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6
Note:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 */
public class SJT_697DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        //每个数出现次数的map,键为这个数，值为出现次数、第一次出现的位置、最后一次出现的位置；
        Map<Integer,ArrayList<Integer> > map = new HashMap<Integer,ArrayList<Integer> >();
        ArrayList<Integer> arr;
        for(int i=0; i<nums.length; i++)
        {
            if(map.get(nums[i]) == null)
            {
                map.put(nums[i],new ArrayList<Integer>(Arrays.asList(1,i,i)));
            }else
            {
                arr = map.get(nums[i]);
                arr.set(0,arr.get(0)+1);//出现次数加一   不能用add
                arr.set(2,i);//更新最后出现的位置
                map.put(nums[i], arr);
            }
        }
        int maxCount = 0;
        for(ArrayList<Integer> a : map.values() )//找出出现某（些）元素出现最多的次数：度
        {
            if(a.get(0)>maxCount)
                maxCount = a.get(0);
        }
        int shortLen = Integer.MAX_VALUE;
        int len;
        for(ArrayList<Integer> d : map.values() )
        {
            if(d.get(0) == maxCount)//找到使度为maxCount的元素的第一个出现的位置和最后一个出现的位置
            {
                len = d.get(2)-d.get(1)+1;
                if(len < shortLen)
                    shortLen = len;
            }
        }
        return shortLen;
    }
}
/*

89 / 89 test cases passed.
Status: Accepted
Runtime: 26 ms
Memory Usage: 39 MB
Your runtime beats 46.34 % of java submissions.
 */