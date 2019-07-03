class Solution { //Runtime: 1228 ms, faster than 5.01% of Java online submissions for Sum of Even Numbers After Queries.
                //Memory Usage: 56.9 MB, less than 98.88% of Java online submissions for Sum of Even Numbers After Queries.         
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum =0;
        int[] result = new int[queries.length];
          for(int i =0 ;i< queries.length;i++)
          {
               A[queries[i][1]]  = A[queries[i][1]] + queries[i][0];
              for(int j =0;j<A.length;j++)
              {
                  if(A[j]% 2 == 0)
                   sum+=A[j];   
              }
              result[i] = sum;
              sum =0;
          }
        return result;
    }
}
