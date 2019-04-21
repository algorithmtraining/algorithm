package com.jt.easy.array.d201903;
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/
public class SJT18_88MergeSortedArray
{
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null) return;//没分配空间，合不了
		if(m == 0){//err1 nums1没有要合并的数据
            for(int i=0;i<n;i++)
            {
                nums1[i] = nums2[i];
            }
            return;//结束
        }
        int i=m-1;
        for(int j=0; j<n; j++)
        {
        	//nums2[j]为要插入的元素（插入到nums1中哪个元素后面呢）
        	//nums1[i]<=nums2[j],插入到nums1[i]后面(排队，我比你大，排在你后面);i+1为要插入的位置。
            i = m-1;//每次从nums1最后一个元素开始比较
            while(i>=0 && nums2[j]<nums1[i])//我（nums2[j]）没有nums1[i]大，大个子往后站。
        	{                
            	nums1[i+1] = nums1[i];//将nums1中较大的数后移，腾位置
            	i--;//寻找下一个索引
        	}                            
            nums1[i+1] = nums2[j];//插入
            m = m+1;
        }
    }
	public static void main(String[] args)
	{
		SJT18_88MergeSortedArray sjt18 = new SJT18_88MergeSortedArray();
		
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		sjt18.merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++)
		{
			System.out.println(nums1[i] + " ");
		}
		System.out.println();
		//----------------test通过 1 2 2 3 5 6-----------------------
				
		int[] nums3 = new int[] {2,0};
		int[] nums4 = new int[] {1};
		sjt18.merge(nums3, 1, nums4, 1);
		for (int i = 0; i < nums3.length; i++)
		{
			System.out.println(nums3[i] + " ");
		}
		System.out.println();
	}
}
/*

*/