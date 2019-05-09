public class PivotIndex_zane_05_08 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        PivotIndex_zane_05_08 pivotIndex = new PivotIndex_zane_05_08();
        System.out.println(pivotIndex.pivotIndex(nums));

    }

    /**
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int sum = 0;
        if (nums.length < 3) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int sum1 = 0;
        int sum2 = 0;

        sum2 = sum - nums[0];
        if (sum2 == 0) {
            return -1;
        }

        for (int i = 1; i < nums.length; i++) {
            sum1 += nums[i - 1];
            sum2 = sum2 - nums[i];
            if (sum1 == sum2) {
                return i;
            }
        }

        return -1;
    }


    public int pivotIndex2(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int sum1 = 0;
        int sum2 = 0;
        int index = -1;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {

            if (nums[i] == 0) {
                i++;
            } else if (nums[j] == 0) {
                j--;
            }
            if (sum1 == sum2) {
                sum1 += nums[i++];
                sum2 += nums[j--];

            }else if (sum1 < sum2) {
                sum1 += nums[i++];
            }else if (sum1 > sum2) {
                sum2 += nums[j--];
            }


        }
        if (sum1 == sum2 && i==j) {
            index = i;
        }

        return index;
    }

}
