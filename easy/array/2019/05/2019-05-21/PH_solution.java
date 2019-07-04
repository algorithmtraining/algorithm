class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<2)
        {
            return true;
        }
        int k =A[A.length-1] - A[0];
        for (int i =0;i<A.length-1;i++)
        {
         if(k>0)
         {
            if( A[i+1] - A[i] <0)
            {
                return false;
            }
         }
            else{
        if(k<0)
        {
                if(A[i+1] - A[i] >0)
                {
                    return false;
                }
        }
        else
        {
                if(A[i+1] - A[i] !=0)
                {
                    return false;
                }
            }
        }
        }
        return true;
    }
}
