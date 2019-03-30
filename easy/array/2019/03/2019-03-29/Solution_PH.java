class Solution {  //Runtime: 783 ms, faster than 5.82% of Java online submissions for Contains Duplicate II.

                  //Memory Usage: 44 MB, less than 30.77% of Java online submissions for Contains Duplicate II.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i =0;i<nums.length;i++)
        {
            int j =1;
            while(j<=k && j+i<nums.length)
            {
               if(nums[j+i] == nums[i])
                {
                    return true;
                } 
                else{
                    j++;
                }
            }  
        }
        return false;
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
            else if ( map.get(nums[i])!=i && i-map.get(nums[i])<=k)
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
