package com.jt.easy.array.d201904;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/
public class SJT09H_448FindAllNumbersDisappearedinanArray
{
	//将数组中的每个值看做是一个指针index，(index)指向第index个（从1开始）元素（即nums[index-1]）；被指向的nums[index-1]设为负值，标明数组中有index这个数，若为正值，标明没有index这个数，将其加入list;
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums==null || nums.length==0) return list;
        for(int i=0; i<nums.length; i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0)
                nums[index] = -nums[index];
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
                list.add(i+1);
        }
        return list;
    }
}
/*
http://www.cnblogs.com/grandyang/p/6222149.html
第二种方法是将nums[i]置换到其对应的位置nums[nums[i]-1]上去，
比如对于没有缺失项的正确的顺序应该是[1, 2, 3, 4, 5, 6, 7, 8]，
而我们现在却是[4,3,2,7,8,2,3,1]，我们需要把数字移动到正确的位置上去，
比如第一个4就应该和7先交换个位置，
以此类推，最后得到的顺序应该是[1, 2, 3, 4, 3, 2, 7, 8]，
我们最后在对应位置检验，如果nums[i]和i+1不等，
那么我们将i+1存入结果res中即可，参见代码如下：

解法二：

class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> res;
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums[i], nums[nums[i] - 1]);
                --i;
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != i + 1) {
                res.push_back(i + 1);
            }
        }
        return res;
    }
};
 
下面这种方法是在nums[nums[i]-1]位置累加数组长度n，
注意nums[i]-1有可能越界，所以我们需要对n取余，
最后要找出缺失的数只需要看nums[i]的值是否小于等于n即可，
最后遍历完nums[i]数组为[12, 19, 18, 15, 8, 2, 11, 9]，
我们发现有两个数字8和2小于等于n，那么就可以通过i+1来得到正确的结果5和6了，参见代码如下：

解法三：

class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> res;
        int n = nums.size();
        for (int i = 0; i < n; ++i) {
            nums[(nums[i] - 1) % n] += n;            
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= n) {
                res.push_back(i + 1);
            }
        }
        return res;
    }
};
*/