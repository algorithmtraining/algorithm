class Solution {
    public int rob(int[] nums) {  
        int l = nums.length;
        if (l ==0)   return 0;
        if(l==1)     return nums[0];
       
        int[] max = new int[l];
        max[0] = nums[0];
        max[1] =Math.max(nums[0],nums[1]);
        for(int i = 2;i<l;i++)
        {
           max[i] = Math.max(max[i-2]+nums[i],max[i-1]);
        }
        return max[l-1];
    }
}
