class Solution {           //Runtime: 84 ms, faster than 21.46% of Java online submissions for Rotate Array.
                           //Memory Usage: 38.4 MB, less than 18.09% of Java online submissions for Rotate Array.
    public void rotate(int[] nums, int k) {
        int last = 0;
        for(int i = 0; i< k; i++)
        {
            last = nums[nums.length-1];
            int j = nums.length-1;
            while(j!=0)
            {
              nums[j] = nums[j-1];
                j--;
            }
            nums[0] = last;
        }
    }
}
//两次循环    
class Solution {  // Runtime: 335 ms, faster than 6.42% of Java online submissions for Contains Duplicate.
                  // Memory Usage: 43.1 MB, less than 25.08% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicate(int[] nums) {
        
        for(int i = 0; i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                 if(nums[i] == nums[j])
              {
                return true;
              }
                  
            }         
        }
        return false;
    }
}
