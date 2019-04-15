public class MatrixReshape_zane {


    public static void main(String[] args) {
        int[][] nums = {{1,2}, {3,4}};
        System.out.println(matrixReshape(nums, 1, 4));
    }

    /**
     * no.566. 将原始的二维数组转为一维数组进行临时存放，再根据要求转化为新的二维数组
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        int m = nums.length;
        int n = nums[0].length;

        if (r * c != m * n) {
            return nums;
        }

        int count = 0;
        int[] tempNum = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tempNum[count++] = nums[i][j];
            }
        }

        int[][] res = new int[r][c];
        int temp = 0;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = tempNum[temp++];
            }

        }


        return res;
    }
}


