class Solution { // Runtime: 1 ms, faster than 63.90% of Java online submissions for Largest Number At Least Twice of Others.
        //Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
    public int dominantIndex(int[] nums) {
        int bigone = nums[0];
        int index = 0;
        if(nums.length <2)
        {
            return 0;
        }
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]>bigone)
            {
                bigone = nums[i];
                index =i;
            }
        }
         Arrays.sort(nums);
         int bigest = nums[nums.length-1];
         int  second = nums[nums.length-2];
        if(bigest >= 2*second)
        {
            return index;
        }
        else return -1;
    }
}
