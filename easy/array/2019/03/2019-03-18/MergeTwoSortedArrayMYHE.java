package cn.eilene.leetcode;

/**
 * NO.88. 合并两个有序数组
 * @author MYHE
 * @date 2019/4/22
 * 思想：双指针分别指向两个数组比较两个值的大小，赋给临时开辟的数组里面
 */
public class MergeTwoSortedArrayMYHE {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] res = new int[m+n];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < m && j < n) {
                if(nums1[i] < nums2[j]){
                    res[k++] = nums1[i++];
                } else {
                    res[k++] = nums2[j++];
                }
            }

            while (i < m ){
                res[k++] = nums1[i++];
            }

            while (j < n) {
                res[k++] = nums2[j++];
            }

            for (int l = 0 ; l < m + n ; l ++) {
                nums1[l] = res[l];
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5,7,0,0,0};
        int m = 5;
        int[] nums2 = {2,5,6};
        int n = 3;
        MergeTwoSortedArrayMYHE mergeTwoSortedArrayMYHE = new MergeTwoSortedArrayMYHE();
        Solution solution = mergeTwoSortedArrayMYHE.new Solution();
        solution.merge(nums1, m , nums2, n);

    }
}
