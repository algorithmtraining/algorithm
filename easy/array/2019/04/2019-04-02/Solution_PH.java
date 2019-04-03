class Solution {
    public void moveZeroes(int[] nums) {
       int j=nums.length-1;
        int i =0;
        for(;i<=j;i++)
            {
            if(nums[i]==0)
                {
                int k=i;
                while(k<j)
                    {                    nums[k]=nums[++k];
                     
                }
                nums[j]=0;
                j--;
                i--;
            }
        }
    }
}
