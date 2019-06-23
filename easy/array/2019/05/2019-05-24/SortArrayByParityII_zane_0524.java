import java.security.PublicKey;

public class SortArrayByParityII_zane_0524 {

    public static void main(String[] args) {

        int[] A = {4,2,5,7};
        SortArrayByParityII_zane_0524 sortArrayByParity = new SortArrayByParityII_zane_0524();
        A = sortArrayByParity.sortArrayByParity(A);
        System.out.println(A);
    }

    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int i = 0;
        int j;
        while (i < length) {
            j = length - 1;
            if (i % 2 == 0) {
                if (A[i] % 2 == 1) {
                    while (i < j) {
                        if (A[j] % 2 == 0) {
                            swap(A,i,j);
                            break;
                        }
                        j--;
                    }
                }
            }else{
                if (A[i] % 2 == 0) {
                    while (i < j) {
                        if (A[j] % 2 == 1) {
                           swap(A,i,j);
                            break;
                        }
                            j--;
                    }
                }
            }
            i++;
        }
        return A;

    }


    public void swap(int[] A, int i,int j) {
        int temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


}
