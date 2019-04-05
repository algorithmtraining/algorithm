public class Solution {
    // 先求和再减去所有值
    public int missingNumber2(int[] nums) {
        int exceptedSum = nums.length*(nums.length + 1) / 2;
        int actualSum = 0;

        for (int num : nums)
        {
            actualSum += num;
        }

        return exceptedSum - actualSum;
    }
    public int missingNumber(int[] nums) {
        if (nums.length == 1){
            if (nums[0] >= 1){
                return nums[0] - 1;
            }else{
                return nums[0] + 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int elem : nums){
            max = Math.max(max, elem);
        }
        boolean mark[] = new boolean[max+1];
        for (int elem : nums){
            mark[elem] = true;
        }

        for (int i = 0; i < nums.length; i++){
            if (!mark[i]){
                return i;
            }
        }

        return max+1;
    }
}
