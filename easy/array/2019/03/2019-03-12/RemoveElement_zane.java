public class RemoveElement_zane {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 2;
        System.out.println(removeElement1(nums, val));

    }

    /**
     * 使用双指针，如果数组某项值等于val,
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    /**
     * 官方题解的第二种方法，但是会出现数组元素顺序改变的情况！
     *
     * @param nums
     * @param val
     * @return
     */

    public static int removeElement1(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

}
