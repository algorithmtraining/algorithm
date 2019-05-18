import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions_zane_0514 {


    public static void main(String[] args) {

        String S = "aaa";
        LargeGroupPositions_zane_0514 largeGroupPositions = new LargeGroupPositions_zane_0514();
        System.out.println(largeGroupPositions.largeGroupPositions(S));
    }

    /**
     * NO.830
     *
     * @param S
     * @return
     */

    public List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> alist = new ArrayList();
        char[] chars = S.toCharArray();
        if (S.length() <= 0) {
            return alist;
        }
        int count = 1;
        int begin = 0;
        int end = -1;
        char temp = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (temp == chars[i]) {
                count++;
            } else {
                if (count >= 3) {
                    end = i - 1;
                    List<Integer> bList = new ArrayList<>();
                    bList.add(begin);
                    bList.add(end);
                    alist.add(bList);
                }
                temp = chars[i];
                begin = i;
                count = 1;
            }
        }

        if (count >= 3) {
            end = chars.length - 1;
            List<Integer> bList = new ArrayList<>();
            bList.add(begin);
            bList.add(end);
            alist.add(bList);
        }
        return alist;
    }


}
