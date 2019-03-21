import java.util.ArrayList;
import java.util.List;

public class YangHui_zane {

    public static void main(String[] args) {
        generate(5);
    }


    /**
     * NO.118 杨辉三角，执行用时1ms
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> aList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || i == 1) {
                    aList.add(1);
                } else {
                    if (j != 0 && j != i) {
                        aList.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                    } else {
                        aList.add(1);
                    }
                }
            }
            lists.add(aList);
        }
        return lists;

    }
}
