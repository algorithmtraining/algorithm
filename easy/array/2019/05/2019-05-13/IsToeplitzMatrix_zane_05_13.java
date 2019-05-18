import java.util.concurrent.ForkJoinPool;

public class IsToeplitzMatrix_zane_05_13 {

    public static void main(String[] args) {

    }
    /**
     *  NO. 766
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {

        boolean[] isVisited = new boolean  [matrix.length + matrix[0].length - 1];
        int[] nums = new int[matrix.length + matrix[0].length - 1];
        int start = 0 - (matrix[0].length - 1);
        int pos = 0;
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pos = i - j - start;
                if (!isVisited[pos]){
                    isVisited[pos] = true;
                    nums[pos] = matrix[i][j];
                }else {
                    if (matrix[i][j] != nums[pos]) {
                        flag = false;
                    }
                }
            }
        }

        return flag;
    }

}
