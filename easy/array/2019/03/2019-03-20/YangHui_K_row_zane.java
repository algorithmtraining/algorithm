import java.util.ArrayList;
import java.util.List;

public class YangHui_K_row_zane {

    public static void main(String[] args) {
        getRow(3);
    }

    /**
     * No.119 杨辉三角2，参照评论使用，空间复杂度为O(k)
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
            res.add(1);
        }
        return res;

    }
}
