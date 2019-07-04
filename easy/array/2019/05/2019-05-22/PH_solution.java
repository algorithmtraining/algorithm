class Solution { //Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
                 //  Memory Usage: 40.2 MB, less than 93.84% of Java online submissions for Sort Array By Parity.          
    public int[] sortArrayByParity(int[] A) {
      int i =0 ,j=A.length-1;
        int temp = 0;
        while(i<j)
        {
            if(A[i] % 2 != 0)
            {
                if(A[j]% 2 == 0)
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
                else{
                    j--;
                }
            }
            else i++;
        }
        return A;
    }
}
