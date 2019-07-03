class Solution { //Runtime: 387 ms, faster than 5.10% of Java online submissions for Sort Array By Parity II.
                //Memory Usage: 41 MB, less than 97.96% of Java online submissions for Sort Array By Parity II.           
    public int[] sortArrayByParityII(int[] A) {
        int temp =0;
        for(int i =0;i<A.length;i++)
        {
            if(i%2 == 0)
            {
                 if(A[i] %2 == 0)
                 {
                     continue;
                 }
                else{
                    for(int j = i+1 ;j<A.length ;j+=2)
                    {
                        if(A[j] % 2 == 0)
                        {
                           temp = A[j];
                           A[j] = A[i];
                           A[i] = temp;
                        }
                    }
                }
            }
            else{
                if(A[i] %2 != 0)
                 {
                     continue;
                 }
                else{
                    for(int j = i+1 ;j<A.length ;j+=2)
                    {
                        if(A[j] % 2 != 0)
                        {
                           temp = A[j];
                           A[j] = A[i];
                           A[i] = temp;
                        }
                    }
                }
            }
           
        }
        return A;
    }
}
