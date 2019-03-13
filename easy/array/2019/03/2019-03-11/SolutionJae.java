class SolutionJae{
    public int removeDuplicates(int[] nums){
        if (nums.length == 1)
        {
            return 1;
        }
        // 定义两个指针i，j
        int i = 0;
        int j = 0;
        while (j < nums.length)
        {
            while (j < nums.length && nums[i] == nums[j]){
                j++;
            }
            // 快指针j已经到数组尾后
            if (j == nums.length){
                break;
            }
            nums[++i] = nums[j++];
        }
        return i + 1;
    }
}
