public class NumMagicSquaresInside_zane {

    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2},
                {1, 2, 3, 4}
        };
        NumMagicSquaresInside_zane numMagicSquaresInside = new NumMagicSquaresInside_zane();
        System.out.println(numMagicSquaresInside.numMagicSquaresInside(grid));

    }

    /**
     * 840. 矩阵中的幻方
     * @param grid
     * @return
     */
    public int numMagicSquaresInside(int[][] grid) {


        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        if (row < 3 || col < 3) {
            return 0;
        }
        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                if (ismagic(grid, i, j)) {
                    count++;

                }
            }
        }
        return count;
    }

    public boolean ismagic(int[][] grid, int row, int col) {
        int _1_9_[] = new int[10];
        int rowsum = 0;
        int colsum = 0;
        //第一条对角线的和
        int line1 = grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2];  //一条对角线的和
        int line2 = 0;

        for (int k = 0; k < 3; k++) {
            rowsum = 0;
            colsum = 0;
            for (int i = 0; i < 3; i++) {
                if (grid[row+k][col+i] < 1 || grid[row+k][col+i] > 9) {
                    return false;
                }
                if (_1_9_[grid[row + k][i + col]] > 0) {
                    return false;     //9个数不能有重复
                }
                _1_9_[grid[row + k][i + col]]++;
                //每一列的和
                colsum += grid[row + k][col + i];
                //每一行的和
                rowsum += grid[row + i][col + k];
                if (k == i) {
                    line2 += grid[row + k][col + i];
                }
            }
            //第二条对角线的和
            if (line1 != rowsum || line1 != colsum) {
                return false;
            }


        }

        return line1 == line2;
    }

}
