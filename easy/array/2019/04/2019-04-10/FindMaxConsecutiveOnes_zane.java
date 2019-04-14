import java.util.EnumSet;

public class FindMaxConsecutiveOnes_zane {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    /**
     * No.485
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxsum = 0;
        int tempsum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                tempsum++;
            }else{
                maxsum = Math.max(tempsum,maxsum);
                tempsum = 0;
            }
        }

        return Math.max(maxsum, tempsum);
    }
}
