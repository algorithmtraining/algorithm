public class SolutionJae{

    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }

        int sum = nums[0];
        int max = sum;

        for (int i = 1; i < nums.length; i++)
        {
            sum = sum > 0 ? sum + nums[i] : nums[i];
            if (sum > max)
            {
                max = sum;
            }
        }

        return max;
   }
}
