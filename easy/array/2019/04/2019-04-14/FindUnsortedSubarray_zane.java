public class FindUnsortedSubarray_zane {

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,2};
        int[] nums1 = {1, 2, 3, 3, 3};
        int[] nums2 = {1, 3, 2, 3, 3};
        System.out.println(findUnsortedSubarray1(nums2));

     }

    /**
     * NO.581 只通过30%的样例
     * @param nums
     * @return
     */
    public static int findUnsortedSubarray(int[] nums) {

        int temp1 = Integer.MIN_VALUE;
        int temp2 = Integer.MIN_VALUE;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length-1 ; i++) {

            if (nums[i] == nums[i + 1]) {
                count1++;
            }
            if (nums[i] > nums[i + 1]) {
                temp1 = i;
                temp1 -= count1;
                count1 = 0;
                break;
            }
        }
        for (int j = nums.length - 1; j>0; j--) {

            if (nums[j] == nums[j - 1]) {
                count2++;
            }
            if (nums[j] < nums[j - 1]) {
                temp2 = j;
                temp2 += count2;
                count2 = 0;
                break;
            }
        }
        if (temp1 == temp2) {
            return 0;
        }

        return temp2 - temp1 + 1;
    }


    /**
     *参考评论中代码，从前往后遍历找到右边最大的乱序下标，从后往前遍历找到左边最小的乱序下标
     * @param nums
     * @return
     */
    public static int findUnsortedSubarray1(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int R = 0;
        int L = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (max > nums[i]) {
                R = i;
            }

            max = Math.max(max, nums[i]);
        }

        for (int j = nums.length - 1; j>=0; j--) {
            if (min < nums[j]) {
                L = j;
            }
            min = Math.min(min, nums[j]);

        }

        return R == L ? 0 : R - L + 1;
    }
}
