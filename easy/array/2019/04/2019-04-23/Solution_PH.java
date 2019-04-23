class Solution { //Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Continuous Increasing Subsequence.
                //Memory Usage: 40.7 MB, less than 5.34% of Java online submissions for Longest Continuous Increasing Subsequence.
    public int findLengthOfLCIS(int[] nums) {
        int count =1;
        int max =1;
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[i+1] > nums[i])
            {
               count ++; 
                 max = Math.max(count,max);
            }
           
            else {
              
               count =1;
            }
        }
        return max;
    }
}
