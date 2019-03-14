public class SolutionJae{
    public static void main(String[] args)
    {
        int[] nums = new int[] {};
        int target = 3;

        System.out.println(new SolutionJae().searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int i = 0;
        for (; i < nums.length; i++)
        {
            if (nums[i] >= target)
            {
                return i;
            }
        }
        return i;
    }
}
