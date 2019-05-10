class Solution { //Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
// Memory Usage: 37.9 MB, less than 98.82% of Java online submissions for Find Pivot Index.            
    public int pivotIndex(int[] nums) {
         int l = nums.length;
        if(l == 0)
        {
            return -1;
        }
            int frontsum = 0;
            int lastsum = 0;
            int k = l-1;
            while(k>0)
            {
                lastsum+=nums[k--];
            }
        int i =0;
            while(i<l-1)
            {
                if(lastsum != frontsum)
                {
                    i++;
                    frontsum+=nums[i-1];
                    lastsum-=nums[i];
                }
                if(lastsum == frontsum)
                {
                    return i;
                }
            }
            return -1;
    }
}
