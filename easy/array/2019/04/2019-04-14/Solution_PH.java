class Solution { //Runtime: 8 ms, faster than 85.53% of Java online submissions for Shortest Unsorted Continuous Subarray.
                 // Memory Usage: 40.8 MB, less than 92.24% of Java online submissions for Shortest Unsorted Continuous Subarray
    public int findUnsortedSubarray(int[] nums) {
        int [] nums1 = Arrays.copyOf(nums,nums.length) ;
        Arrays.sort(nums);
        int begin = 0;
        int last = 0;
        
       
       for(int i =0;i<nums.length;i++)
       {
           if(nums[i]!=nums1[i])
           {
               begin = i;
               break;
           }
       }
        for( int j= nums.length-1; j>0;j--)
        {
            if(nums[j]!=nums1[j])
           {
               last = j+1;
               break;
           }
        }
        return last-begin;
    }
}
