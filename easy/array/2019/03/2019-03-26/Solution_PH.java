class Solution {
    public int majorityElement(int[] nums) { 
       int  mid = nums.length/2;
        Arrays.sort(nums);
        return nums[mid];
    }
}
