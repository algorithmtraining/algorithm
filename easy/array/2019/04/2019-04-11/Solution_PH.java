class Solution {
    public int findPairs(int[] nums, int k) {  
    //Runtime: 14 ms, faster than 53.45% of Java online submissions for K-diff Pairs in an Array.
    //Memory Usage: 41.5 MB, less than 12.44% of Java online submissions for K-diff Pairs in an Array.
        if(k < 0)
        {
            return 0;
        }
        Map <Integer,Integer> map1 = new HashMap<>();      
        Map <Integer,Integer> map3 = new HashMap<>();
        int big = 0;
        int small =0;
        int count =0;
        for(int i =0;i<nums.length;i++)
        {
            map1.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++)
        {
            if(!map3.containsKey(nums[i]))
            {
                 big = nums[i]+k;
                small = nums[i] -k;
              if(map1.containsKey(small)&& !map3.containsKey(small) && map1.get(small)!=i )
              {
                  count ++;
              }
              if(big != small && map1.containsKey(big) && !map3.containsKey(big) && map1.get(big)!=i )
              {
                count ++; 
              }
            }  
            map3.put(nums[i],i);
        }
        return count;        
    }
}
