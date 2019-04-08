class Solution {            // Runtime: 2 ms, faster than 89.40% of Java online submissions for Third Maximum Number.
                           //Memory Usage: 40 MB, less than 5.40% of Java online submissions for Third Maximum Number.
    public int thirdMax(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        if(nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
       int [] arr = new int[3];
        Arrays.sort(nums);        //先将数组排序，定义一个长度为3的数组arr存放最大的前三个数，当前数与arr中元素相同时，进行下一次插入
        if(nums[0]!=nums[1])
        {
        arr[0] = nums[1];
        arr[1] = nums[0];
        }                 
       for(int i =2;i<nums.length;i++)
       {
           if(nums[i] != arr[1] && nums[i] != arr[0])
        {
             if(nums[i]<=arr[1])
           {
               arr[2] = nums[i];
           }
           else if(nums[i]<arr[0])
           {
               arr[2] = arr[1];
               arr[1] = nums[i];
           }
            else {
                arr[2] =arr[1];
                arr[1] = arr[0];
                arr[0] = nums[i];
            } 
        }     
       }            
        if(arr[2]!= nums[0]&&arr[2] == 0)
        {
            return arr[0];
        }
        else return arr[2];
    } 
}
