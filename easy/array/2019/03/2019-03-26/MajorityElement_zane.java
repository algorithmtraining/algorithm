import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement_zane {

    public static void main(String[] args) {

        int[] nums = {-2147483648, 0, 0};
        System.out.println(majorityElement1(nums));
    }

    /**
     * NO.169 先对数组排序，然后进行一次遍历，在遍历过程中记录每个数字出现的个数，和对应的数字
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        Arrays.sort(nums);
        int maxnum = 1;
        int temp = Integer.MAX_VALUE;
        int count = 1;
        int retnum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                if (maxnum < count) {
                    maxnum = count;
                    retnum = nums[i - 1];
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count > maxnum) {
            maxnum = count;
            retnum = nums[nums.length - 1];
        }
        return retnum;
    }

    /**
     * 数组排序之后 如果存在众数 那么中间的数一定是众数
     *
     * @param nums
     * @return
     */
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
     *
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {
        int count = 1;
        int retnum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (retnum == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    retnum = nums[i + 1];
                }
            }
        }

        return retnum;
    }
}
