public class Transpose_zane_0517 {


    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        Transpose_zane_0517 transpose = new Transpose_zane_0517();
        System.out.println(transpose.transpose(A));
    }

    /**
     *867. 转置矩阵
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] B = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[j][i] = A[i][j];
            }
        }


        return B;
    }
}
