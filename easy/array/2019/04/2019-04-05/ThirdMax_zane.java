public class ThirdMax_zane {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        int[] nums1 = {1,2,-2147483648};
        System.out.println(thirdMax(nums1));

    }


    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) {
                secondMax = Math.max(secondMax, nums[i]);
            }

        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != secondMax) {
                thirdMax = Math.max(thirdMax, nums[i]);
                flag = 1;
            }

        }
        if (thirdMax == Integer.MIN_VALUE && flag == 0) {
            return max;
        }


        return thirdMax;

    }
}
