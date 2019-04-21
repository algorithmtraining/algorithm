public class SolutionJae{
    // 使用滑动窗口，窗口大小为k
    public double findMaxAverage(int[] nums, int k) {
        // 全局最大值
        int max = 0;
        // 窗口大小
        int count = 0;
        // 每次窗口滑动后窗口内和最大值
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            if (count < k){
                sum += nums[i];
                max = sum;
                count++;
                continue;
            }
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }

        return max / (k * 1.0);
    }
}
