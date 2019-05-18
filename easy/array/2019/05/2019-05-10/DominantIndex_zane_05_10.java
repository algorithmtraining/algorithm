public class DominantIndex_zane_05_10 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        DominantIndex_zane_05_10 dominantIndex = new DominantIndex_zane_05_10();
        System.out.println(dominantIndex.dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {

        if (nums.length <= 0) {
            return -1;
        }
        int maxnum = nums[0];
        int num=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxnum) {
                maxnum = nums[i];
                num = i;

            }
        }


        for (int d = 0; d < nums.length; d++) {
            if (nums[d] != maxnum && nums[d] != 0) {
                if (maxnum / nums[d] < 2) {
                    return -1;
                }
            }
        }
        return num;
    }

}
