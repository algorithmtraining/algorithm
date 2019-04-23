public class SolutionJae{
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length <= 1){
            return nums.length;
        }

        int fast = 0;
        int slow = 0;
        int maxLen = 1;


        while(fast < nums.length - 1){
            if (nums[++fast] > nums[fast - 1]){
                maxLen = Math.max(fast - slow + 1, maxLen);
            }else {
                slow = fast;
            }
        }

        return maxLen;
    }
}
