class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int j =0 ;
       int k =0 ;
       if(n!=0)
      {
        for(int i =0;i<nums1.length;i++)
        {
          if(k<n && nums1[i] > nums2[k])
           {
             for(int t = nums1.length-1; t >i; t-- )
             {
               nums1[t] = nums[t-1];
             }
             nums1[i] = nums2[k];
             k++;
           }
           while(k<n && i == m+k)
           {
            nums1[i++] =nums2[k++];
           }
        }
      }
    }    
}
