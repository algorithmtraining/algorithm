public class Solution {
    public static void main(String[] args)
    {
        int[] nums = new int[] {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }

    /**
    *map的git方法能做到O(1)
    **/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if (map.containsKey(diff))
            {
                return new int[] {i, map.get(diff)};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
