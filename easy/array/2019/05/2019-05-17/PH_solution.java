class Solution { //Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
      // Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Transpose Matrix.             
    public int[][] transpose(int[][] A) {
        int [][] result = new int[A[0].length][A.length];
       for(int i =0;i<A[0].length;i++)
       {
           for(int j =0;j<A.length;j++)
           {
               result[i][j] = A[j][i];
           }
       }
        return result;
    }
}
