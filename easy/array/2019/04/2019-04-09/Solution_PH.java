class Solution {//Runtime: 28 ms, faster than 19.99% of Java online submissions for Find All Numbers Disappeared in an Array.
                //Memory Usage: 54.2 MB, less than 5.24% of Java online submissions for Find All Numbers Disappeared in an Array.
    public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();
            Map<Integer,Integer>  map = new HashMap<>(); 
        for(int i =0 ;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i =1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
            {
                result.add(i);
            }
        }
        return result;
    }
}
