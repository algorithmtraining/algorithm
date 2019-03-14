public class SolutionPh{
    public int searchInsert(int[] nums, int target){
        int len = nums.length;

        if (tar > nums[len-1])
        {
            return len;
        }

        int i = 0;
        for (; i < len; i++)
        {
            if (nums[i] >= target)
            {
                break;
            }
        }

        return i;
    }
}
