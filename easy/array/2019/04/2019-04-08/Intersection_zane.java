import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection_zane {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};

        int[] num2 = {9, 4, 9, 8, 4};

        num1 = intersection(num1, num2);
        for (int i = 0; i <num1.length ; i++) {
            System.out.println(num1[i]);

        }
    }

    /**
     *NO.349 用set去重，让后找出交集，返回数组
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {

        int length = 0;
        Set aSet = new HashSet();
        Set bSet = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            aSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            bSet.add(nums2[i]);

        }

        Iterator iterator = aSet.iterator();
        while (iterator.hasNext()) {
            int temp = (int) iterator.next();
            if (bSet.contains(temp)) {
                nums1[length++] = temp;
            }
        }

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = nums1[i];
        }

        return arr;

    }
}
