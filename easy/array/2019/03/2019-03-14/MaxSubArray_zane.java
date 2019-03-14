
public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

//        for (int i = 0; i < nums.length; i++)
//            System.out.print(nums[i] + "  ");
    }


    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
    }


}
