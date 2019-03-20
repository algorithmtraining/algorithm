import com.sun.scenario.effect.Merge;

import java.lang.reflect.Method;

public class MergeTwoArray_zane {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge1(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n - 1;
        m--;
        n--;
        for (int i = length; i >= 0; i--) {
            if (n < 0) {
                nums1[i] = nums1[m--];
            } else if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (nums1[m] < nums2[n]) {
                nums1[i] = nums2[n--];
            } else {
                nums1[i] = nums1[m--];
            }
        }

        for (int i = 0; i <= length; i++) {
            System.out.println(nums1[i]);

        }
    }

    /**
     * 参考评论中的解法，代码特别简洁，但是其执行速度比自己写的慢了1ms
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;

        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }

        for (int i = 0; i <= length; i++) {
            System.out.println(nums1[i]);
        }

    }
}
