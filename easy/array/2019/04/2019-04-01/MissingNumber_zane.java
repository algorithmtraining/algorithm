import java.util.*;

public class MissingNumber_zane {

    public static void main(String[] args) {
        MissingNumber_zane zane = new MissingNumber_zane();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(zane.missingNumber1(nums));

    }

    /**
     * No.268 两次遍历， 先把数组放到集合中，然后判断缺失的数字。
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {

        Set<Integer> aSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            aSet.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!aSet.contains(i)) {
                return i;
            }
        }


//        int j = 0;
//        while (aSet.contains(j++)) {
//        }
//        return j-1;

        return 0;

    }


    /**
     * 先拍序，然后再找去缺失的数
     *
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {

        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length + 1; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return i;

    }

    /**
     * 一个数与自身异或结果为0。一个数与0异或之后还是本身。对同一个数据，进行两次按位异或操作，等于数据本身。等性质。
     *
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {

        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }

        return res;

    }

    /**
     * 数组各元素的和与数列的和的差值
     *
     * @param nums
     * @return
     */
    public int missingNumber3(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            sum2 += i;
        }
        sum2 += nums.length;


        return sum2 - sum1;

    }
}
