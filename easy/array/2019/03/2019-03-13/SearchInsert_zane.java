import java.util.EnumSet;

public class SearchInsert_zane {

    public static void main(String[] args) {
        int[] nums = {
                1, 3, 5, 6
        };
        int target = 7;
        System.out.println(searchInsert1(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums[0] > target) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                } else if (nums[i] < target && i + 1 < nums.length && nums[i + 1] > target) {
                    return i + 1;
                } else if (i + 1 == nums.length) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    /**
     * 提交之后耗费时间为5ms,与上个方法相比，减少了比较次数，性能有所提高
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;

            }
        }
        return nums.length;
    }


    /**
     * 采用二分法查找,提交之后耗费时间与第一个方法一样都是6ms
     *
     * @param nums
     * @param target
     * @return
     */
    public static int binarySerach(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;

            }
        }
        return low;
    }

}
