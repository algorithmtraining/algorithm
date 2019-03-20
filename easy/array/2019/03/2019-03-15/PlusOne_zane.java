public class PlusOne_zane {

    public static void main(String[] args) {

        int[] digtits = {9};
        int[] d = plusOne(digtits);

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public static int[] plusOne(int[] digits) {

        int num = 0;
        int length = digits.length;

        digits[length - 1] = digits[length - 1] + 1;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                //如果最高位也进位了
                if (i == 0) {
                    num++;
                } else {
                    digits[i - 1] += 1;
                }
            }
        }

        if (num > 0) {
            int[] nums = new int[digits.length + 1];
            nums[0] = num;
            for (int i = 1; i < nums.length; i++) {
                nums[i] = digits[i - 1];
            }
            return nums;
        } else {
            return digits;

        }

    }
}
