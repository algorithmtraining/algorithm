class Solution { //Runtime: 15 ms, faster than 50.70% of Java online submissions for Maximum Product of Three Numbers.
                //Memory Usage: 41.2 MB, less than 41.73% of Java online submissions for Maximum Product of Three Numbers.
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        if(l<3)
        {
            return 0;
        }
        else return Math.max (nums[0]*nums[1]*nums[l-1],nums[l-1]*nums[l-2]*nums[l-3]);
    }
}
