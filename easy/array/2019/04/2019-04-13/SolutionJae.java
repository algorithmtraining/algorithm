public class SolutionJae {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums[0].length == 0){
            return nums;
        }
        if (nums.length * nums[0].length != r * c){
            return nums;
        }

        int[][] res = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (col < c){
                    res[row][col] = nums[i][j];
                    col++;
                }
                if (col == c){
                    row++;
                    col=0;
                }
            }
        }

        return res;
    }
}
