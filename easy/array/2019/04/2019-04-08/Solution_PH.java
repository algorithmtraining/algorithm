class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { //Runtime: 2 ms, faster than 97.53% of Java online submissions for Intersection of Two Arrays.
                                                         //Memory Usage: 38.6 MB, less than 5.09% of Java online submissions for Intersection of Two Arrays.
        Map <Integer,Integer> map1 = new HashMap<>();
         Map <Integer,Integer> map2= new HashMap<>();
      int[] arraylist = new int[nums2.length]; 
       
        for(int i =0;i<nums1.length;i++)
        {
            map1.put(nums1[i],i);
        }
        for(int i =0;i<nums2.length;i++)
        {
            map2.put(nums2[i],i);
        }
        int j =0;
        int k = 0;
         for(int i =0;i<nums1.length;i++)
        {
             
          if( map2.containsKey(nums1[i]) && map1.get(nums1[i]) == i  )
          {
              arraylist[j++]=nums1[i];
              k++;
              
          }
        }
         int[] result = new int[k]; 
        for(int i =0;i<k;i++)
        {
            result[i] = arraylist[i];
        }
        return result;
    }
}
