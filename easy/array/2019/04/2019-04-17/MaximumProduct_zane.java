import java.util.Arrays;

public class MaximumProduct_zane {

    public static void main(String[] args) {
        int[] nums = {-1, -3, 8, 1, 2, 3};
        System.out.println(maximumProduct(nums));
    }


    /**
     * NO.628 三个数的积最大只分为两种情况，1.就是三个最大的正数的积2.就是两个最小的负数和一个最大的正数的积
     *
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int sum2 = nums[0] * nums[1] * nums[2];
        return sum1 >= sum2 ? sum1 : sum2;
    }


}
