import java.util.HashSet;
import java.util.Set;

public class FairCandySwap_zane_0520 {

    public static void main(String[] args) {
        int[] A = {2,2};
        int[] B = {1,1};
        FairCandySwap_zane_0520 fairCandySwap_zane_0520 = new FairCandySwap_zane_0520();

        int[] c = fairCandySwap_zane_0520.fairCandySwap(A, B);
        System.out.println(fairCandySwap_zane_0520.fairCandySwap(A, B));
    }


    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = getSum(A);
        int sumB = getSum(B);


        int temp = (sumB - sumA) / 2;
        Set<Integer> bset = new HashSet<>();
        for (int i = 0; i < B.length; i++) {
            bset.add(B[i]);
        }
        for (int i = 0; i < A.length; i++) {
            if (bset.contains(A[i] + temp)) {
                return new int[]{A[i], A[i] + temp};
            }
        }
        return new int[]{0,0};

    }

    /**
     * 数组求和
     * @param A
     * @return
     */
    private int getSum(int[] A) {
        int tempSum = 0;
        for (int i = 0; i < A.length; i++) {
            tempSum += A[i];
        }
        return tempSum;
    }



}
