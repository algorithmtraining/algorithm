import java.util.logging.Level;

public class ValidMountainArray_zane_0525 {



    public static void main(String[] args) {
        int[] A = {2,1};
        ValidMountainArray_zane_0525 validMountainArray = new ValidMountainArray_zane_0525();
        boolean flag = validMountainArray.validMountainArray(A);
        System.out.println(flag);
    }

    public boolean validMountainArray(int[] A) {
        int length = A.length;

        if (length == 0 || length == 1) {
            return false;
        }
        int i = 0;
        while (i < length - 1) {
            if (A[i] < A[i + 1]) {
                if (i == length - 2) {
                    return false;
                }
                i++;
            }else {
                break;
            }
        }
        while (i < length - 1) {
            if (A[i] > A[i + 1]) {
                if (i == 0) {
                    return false;
                }
                i++;
            }else {
                return false;
            }
        }
        return true;
    }


}
