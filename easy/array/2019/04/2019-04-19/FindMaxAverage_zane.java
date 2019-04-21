public class FindMaxAverage_zane {


    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(findMaxAverage(nums, 2));
    }

    public static double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double maxavg = Integer.MIN_VALUE;
        double tempsum = 0;


        /**
         * NO.643 采用双循环，超时
         */
        for (int i = 0; i < n - k + 1; i++) {

            for (int j = i; j < i + k; j++) {
                tempsum += nums[j];
            }
            maxavg = Math.max(maxavg, tempsum);
            tempsum = 0;
        }


        return maxavg / k;
    }


    /**
     * 采用滑动窗口，降低了时间复杂度
     * @param nums
     * @param k
     * @return
     */
    public static double findMaxAverage1(int[] nums, int k) {

        int n = nums.length;
        double maxavg = Integer.MIN_VALUE;
        double tempsum = 0;

        for (int i = 0; i < k; i++) {
            tempsum += nums[i];
        }
        maxavg = tempsum / k;

        int i = 1;
        while (i+k < n){
            tempsum = tempsum - nums[i - 1] + nums[i + k - 1];
            maxavg = Math.max(maxavg,tempsum / k);
            i++;
        }


        return maxavg;
    }

}
