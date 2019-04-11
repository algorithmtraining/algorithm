class Solution { //Runtime: 3 ms, faster than 89.81% of Java online submissions for Max Consecutive Ones.
                   //Memory Usage: 39.8 MB, less than 24.42% of Java online submissions for Max Consecutive Ones.
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int lastcount =0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]==1)
            {
                count++;
            }
            else
            {  
                 count=0;
                continue;
            }
            lastcount= Math.max(count,lastcount);
        }
        return lastcount;
    }
}
