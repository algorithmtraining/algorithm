import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_zane {

    public static void main(String[] args) {
        System.out.println(containsDuplicate2(new int[]{1, 2}));

    }


    public static boolean containsDuplicate1(int[] nums) {

        if (nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 感觉
     * @param nums
     * @return
     */
    public static boolean containsDuplicate2(int[] nums) {

        Set sets = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            sets.add(nums[i]);
        }

        if (sets.size() < nums.length)
        {
            return true;
        }
        return false;
    }

    /**
     * 先排序，邻近两个是否相同
     * @param nums
     * @return
     */
    public static boolean containsDuplicate3(int[] nums) {

        Arrays.sort(nums);


        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }


}
