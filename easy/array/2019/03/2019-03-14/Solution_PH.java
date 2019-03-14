class Solution {
   public int maxSubArray(int[] nums){
          int max = nums[0];
          int sum = 0 ;
          int j = 0;
          for(int i =0;i<nums.length;i++)
          {
            sum = sum+ nums[j];
            if( sum < nums[i])
            {
             sum = 0;
             j = i ;
             i--;
            }
            else
            { 
              if( sum > max)
              {
                max = sum ;
              }
              j++;
            }
          }
         return max;
    }
}
