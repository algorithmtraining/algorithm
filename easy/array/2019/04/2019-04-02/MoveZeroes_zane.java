public class MoveZeroes_zane {


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }


    /**
     * NO.283.  扫描一遍两个指针，如果元素不为0，就将元素赋值为慢指针。循环完毕之后将后面的空元素置为零
     *
     * @param nums
     */

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int j = 0;
        while (j < length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
        while (i < length) {
            nums[i++] = 0;
        }

        for (i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}
