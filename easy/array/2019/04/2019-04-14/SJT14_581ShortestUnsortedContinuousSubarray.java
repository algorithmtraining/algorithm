package com.jt.easy.array.d201904;
/*

*/
public class SJT14_581ShortestUnsortedContinuousSubarray
{
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null || nums.length==1)return 0;       
        int i,j;
        for(i=0; (i+1<nums.length) && (nums[i]<=nums[i+1]); i++){};//（从左到右）找到一个逆序对停止
        if(i==nums.length-1)//没有找到，说明整体有序
            return 0;
        for(j=nums.length-1; (j-1>=0) && (nums[j]>=nums[j-1]); j--){};//（从右到左）找到一个逆序对停止
        int smin= Integer.MAX_VALUE, smax=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++)//找到子区间的最大值和最小值
        {
            if(nums[k]<smin) smin=nums[k];
            if(nums[k]>smax) smax=nums[k];
        }
        for(j=j+1;j<nums.length && smax>nums[j];j++){};//子区间的最大值smax比已正确排序位置的值小
        for(i=i-1;i>=0 && smin<nums[i];i--){};//子区间的最大值smax比已正确排序位置的值小
        //i ,j 是已经归位的值的索引
        return j-i-1;
    }
    public static void main(String[] args)
	{
    	SJT14_581ShortestUnsortedContinuousSubarray continuousSubarray = new SJT14_581ShortestUnsortedContinuousSubarray();
    	//System.out.println(continuousSubarray.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
    	//System.out.println(continuousSubarray.findUnsortedSubarray(new int[] {1,2,3,4}));
    	System.out.println(continuousSubarray.findUnsortedSubarray(new int[] {-100,-99,-98,-97,-96,-95,-94,-93,-92,-91,-90,-89,-88,-87,-86,-85,-84,-83,-82,-81,-80,-79,-78,-77,-76,-75,-65,-53,-73,-63,-67,-61,-39,-58,-56,-55,-68,-66,-74,-49,-60,-51,-62,-42,-47,-54,-43,-71,-64,-59,-45,-69,-57,-41,-70,-44,-46,-50,-48,-72,-52,-40,-38,-37,-36,-35,-34,-33,-32,-31,-30,-29,-28,-27,-26,-25,-24,-23,-22,-21,-20,-19,-18,-17,-16,-15,-14,-13,-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99}));
	}
}
/*

*/