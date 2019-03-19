public class SolutionJae{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;  // 指向nums1中最后一个有效元素
        int j = nums1.length - 1; // 指向nums1的尾部
        int k = n - 1;  // 指向nums2的尾部

        while (k >= 0 && i >= 0){
            if (nums2[k] > nums1[i]){
                nums1[j--] = nums2[k--];
            }else {
                nums1[j--] = nums1[i--];
            }
        }

        // 分别处理两个数组中未处理完的元素
        while (k >= 0 && j >= 0){
            nums1[j--] = nums2[k--];
        }

        while (i >= 0 && j >= 0){
            nums1[j--] = nums1[i--];
        }
    }
}
