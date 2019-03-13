import org.junit.Test;

public class RemoveDuplicates {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        int k = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
                nums[++k] = nums[j];
            }
        }

        for (int i = 0; i < k + 1; i++) {
            System.out.println(nums[i]);
        }

//        return k + 1;

    }

    /**
     * 官方题解，自己手撸一遍
     */

    @Test
    public void sol() {
        int[] nums = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k = 0; k < i + 1; k++) {
            System.out.println(nums[k]);
        }
    }

}
