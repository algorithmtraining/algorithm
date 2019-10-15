package stack;

import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 因为num1是num2的子集，如果要在num2中寻找num1中元素的下一个更大元素，则最重要的是要首先找到num1中元素在num2中的位置，所以首先将num2转换为一个map
 * key为num2中元素，value为对应key在num2的索引。
 *
 */
public class NextGreaterElement_ZANE_0823_NO496 {

    public static void main(String[] args) {
        NextGreaterElement_ZANE_0823_NO496 nextGreaterElement_zane_0823_no496 = new NextGreaterElement_ZANE_0823_NO496();
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};


        int[] res = nextGreaterElement_zane_0823_no496.nextGreaterElement(num1, num2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = arrayToMap(nums2);
        int index;
        int greaterNum;
        for (int i = 0; i < nums1.length; i++) {
            index = map.get(nums1[i]);
            greaterNum = getGreaterNum(nums2, nums1[i], index);
            res[i] = greaterNum;
        }
        return res;
    }

    public Map<Integer, Integer> arrayToMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        return map;
    }

    public int getGreaterNum(int[] nums, int key, int index) {
        int i = index;
        while (i < nums.length) {
            if (nums[i] > key) {
                return nums[i];
            }
            i++;
        }
        return -1;

    }
}
