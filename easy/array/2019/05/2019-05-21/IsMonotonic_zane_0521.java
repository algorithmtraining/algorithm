public class IsMonotonic_zane_0521 {


    /**
     *
     * 896. 单调数列
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2) {
            return true;
        }
        if (!isDecrease(A) && !isIncrease(A)) {
            return false;
        }
        return true;
    };

    private boolean isIncrease(int [] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private boolean isDecrease(int[] B) {
        for (int i = 1; i < B.length; i++) {
            if (B[i] > B[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
