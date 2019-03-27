import java.util.EnumSet;
import java.util.logging.Level;

public class Rotate_zane {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate4(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = temp;
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

//    public static void rotate2(int[] nums, int k) {
//
//        int temp;
//        int skip;
//
//        for (int i = 0; i < nums.length / 2; i++) {
//            if (nums.length % 2 == 0) {
//                skip = k % nums.length;
//            } else {
//                skip = k % nums.length + 1;
//            }
//            temp = nums[i];
//            nums[i] = nums[i + skip];
//            nums[i + skip] = temp;
//        }
//
//        if (nums.length % 2 == 1) {
//            temp = nums[nums.length / 2];
//            for (int i = nums.length / 2 + 1; i < nums.length; i++) {
//                nums[i - 1] = nums[i];
//            }
//            nums[nums.length - 1] = temp;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//    }


    /**
     * 想到相互交换的这种方法，但是代码写了好久，还是有问题。看来编程能力还是有待提高呀！
     * @param nums
     * @param k
     */
    public static void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // 第一次交换完毕后，前 k 位数字位置正确，后 n-k 位数字中最后 k 位数字顺序错误，继续交换
        for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {
            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }



    }

    /**
     * 使用3次反转数组，这个想法确实挺好，没想到！
     * @param nums
     * @param k
     */
    public static void rotate4(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums, 0, k - 1);
        reverse(nums,k,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

        private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }




}
