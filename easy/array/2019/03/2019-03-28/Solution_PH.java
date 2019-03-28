class Solution {  // map映射    
      //Runtime: 9 ms, faster than 60.40% of Java online submissions for Contains Duplicate.
      //Memory Usage: 44.8 MB, less than 5.03% of Java online submissions for Contains Duplicate. 
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length ;i++)
        {
            if(map.containsKey(nums[i]) )
            {
                return true;
            }
            else
            {
                map.put(nums[i],i);
            }
            
        }
        return false;
    }
}
