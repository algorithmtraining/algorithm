import java.util.*;

public class FindDisappearedNumbers_zane {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers1(nums).toString());

    }

    /**
     * NO.448 空间复杂度为O(n)不符合题意
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> aList = new ArrayList<>();
        Set<Integer> aSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            aSet.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!aSet.contains(i)) {
                aList.add(i);
            }
        }

        return aList;
    }

    /**
     * 参考评论，将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> aList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                aList.add(i + 1);
            }
        }

        return aList;
    }

}
