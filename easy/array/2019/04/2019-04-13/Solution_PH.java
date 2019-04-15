class Solution { // Runtime: 2 ms, faster than 82.55% of Java online submissions for Reshape the Matrix.
                // Memory Usage: 47.2 MB, less than 6.88% of Java online submissions for Reshape the Matrix.
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int cow = nums[0].length;
        int [][] result = new int[r][c];
        if(row * cow < r*c)
        {
            return nums;
        }
        int p=0;
        int k=0;
        for(int i =0;i<row;i++)
             {
                  for(int j =0;j<cow;j++)
                {
                          if(p<c && k<r)
                       {
                          result[k][p++] = nums[i][j]; 
                       }
                      else 
                      {
                          k++;
                          p =0;
                          j--;
                      }                                  
               }                      
          }
        return result;
    }
}
