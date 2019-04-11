public class Rob_I_zane {

    public static void main(String[] args) {

        int[] nums = {2,1,1, 3, 1};

        rob1(nums);


    }
    public  static  int rob(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (i % 2 == 0) {
                sum2 += nums[i - 1];
            }else {
                sum1 += nums[i - 1];
            }
        }
        return Math.max(sum1, sum2);
    }

    public  static  int rob1(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(sum1, sum2 + nums[i]);
            sum2 = sum1;
            sum1 = res;
        }
        return res;
    }

}
