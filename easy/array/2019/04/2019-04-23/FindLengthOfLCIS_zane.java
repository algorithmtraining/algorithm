public class FindLengthOfLCIS_zane {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7};
        int[] nums1 = {2, 1, 3};
        FindLengthOfLCIS_zane findLengthOfLCIS = new FindLengthOfLCIS_zane();
        System.out.println(findLengthOfLCIS.findLengthOfLCIS(nums1));
    }


    /**
     * NO.674 最长连续递增序列
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        int maxcount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                maxcount = Math.max(count, maxcount);
                count = 1;
            }
        }
        maxcount = Math.max(count, maxcount);
        return maxcount;
    }

}
