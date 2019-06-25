public class SortedSquares_zane_0528 {
    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        SortedSquares_zane_0528 sortedSquares = new SortedSquares_zane_0528();
        A = sortedSquares.sortedSquares(A);
        System.out.println(A);
    }

    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        int lenth = A.length;

        for (int i = 0; i < lenth; i++) {
            B[i] = (int) Math.pow(A[i], 2);
        }

        int i = 0;
        int j = lenth - 1;
        int k = lenth-1;
        while (i <= j) {
            if (B[i] < B[j]) {
                A[k--] = B[j--];
            }else {
                A[k--] = B[i++];
            }
        }

        return A;
    }
}
