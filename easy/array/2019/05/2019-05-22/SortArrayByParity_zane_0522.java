public class SortArrayByParity_zane_0522 {

    public static void main(String[] args) {

        int[] A = {0,1};
        SortArrayByParity_zane_0522 sortArrayByParity = new SortArrayByParity_zane_0522();
        A = sortArrayByParity.sortArrayByParity(A);
        System.out.println(A);
    }

    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int temp;

        int i = 0;
        int j = length-1;
        while (i < j) {
            if (A[i] % 2 == 0) {
                i++;
            }

            if (A[j] % 2 == 1) {
                j--;
            }

            if (A[i] % 2 == 1 && A[j] % 2 == 0 && i<j) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }

        return A;

    }


}
