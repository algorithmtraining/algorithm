class Solution { //Runtime: 1347 ms, faster than 6.59% of Java online submissions for Maximum Average Subarray I.
                 //Memory Usage: 41.3 MB, less than 92.68% of Java online submissions for Maximum Average Subarray I
    public double findMaxAverage(int[] nums, int k) {
        double max = -10000;
        double sum =0;
        int i =0;
            while(i <= nums.length- k)
        {
            sum = 0;
            for(int j = 0;j<k;j++)
            {
                sum+=nums[j+i];
            }
            max = Math.max(sum/k,max);
            i++;
        }
        return max;
    }    
}
