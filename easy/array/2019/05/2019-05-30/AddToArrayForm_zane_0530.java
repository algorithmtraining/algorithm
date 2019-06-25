import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm_zane_0530 {

    public static void main(String[] args) {
//        int[] A = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int K = 1;
        int K = 23;

        int[] A = {0};
        AddToArrayForm_zane_0530 addToArrayForm = new AddToArrayForm_zane_0530();
        List<Integer> list = addToArrayForm.addToArrayForm(A, K);
        System.out.println(list);

    }


    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> lastList = new ArrayList<>();
        List<Integer> alastList = new ArrayList<>();

        int temp = 0;
        int temp1 = 0;
        List<Integer> integerList = LengthNum(K);
        int i, j;
        for (i = integerList.size() - 1, j = A.length - 1; i >= 0 && j >= 0; i--, j--) {
            alastList.add(A[j] + integerList.get(i));
        }
        if (j >= 0) {
            for (int m = j; m >= 0; m--) {
                alastList.add(A[m]);
            }
        }
        if (i >= 0) {
            for (int m = i; m >= 0; m--) {
                alastList.add(integerList.get(m));
            }
        }
        Collections.reverse(alastList);
        for (int k = alastList.size() - 1; k >= 0; k--) {
            alastList.set(k, alastList.get(k) + temp1);
            temp = alastList.get(k) % 10;
            temp1 = alastList.get(k) / 10;
            lastList.add(temp);
        }
        if (temp1 != 0) {
            lastList.add(temp1);
        }
        Collections.reverse(lastList);

        return lastList;

    }

    public static List<Integer> LengthNum(int num) {
        int count = 0;          //计数
        List<Integer> integerList = new ArrayList<>();
        while (num >= 1) {
            integerList.add(num % 10);
            num /= 10;
            count++;
        }
        Collections.reverse(integerList);
        return integerList;
    }

}
