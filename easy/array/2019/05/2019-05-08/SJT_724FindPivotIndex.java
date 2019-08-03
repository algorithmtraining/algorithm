/*
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index
 is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1.
If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:

Input:
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation:
The sum of the numbers to the left of index 3 (nums[3] = 6)
 is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.


Example 2:

Input:
nums = [1, 2, 3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.


Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].
 */
public class SJT_724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int[] leftSum = new int[nums.length];//分别存放不同index，左边各个数的和（包括位于index的数）
        int[] rightSum = new int[nums.length];
        int lsum = 0, rsum = 0;
        for (int i = 0; i < nums.length; i++) {
            lsum += nums[i];
            leftSum[i] = lsum;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            rsum += nums[j];
            rightSum[j] = rsum;
        }
        for (int k = 0; k < nums.length; k++) {
            if (leftSum[k] == rightSum[k])
                return k;
        }
        return -1;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Find Pivot Index.
 */