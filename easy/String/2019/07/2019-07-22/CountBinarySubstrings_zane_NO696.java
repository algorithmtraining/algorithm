package string;

/**
 * @author zane
 */
public class CountBinarySubstrings_zane_NO696 {
    public static void main(String[] args) {
        String s = "00110011";
        CountBinarySubstrings_zane_NO696 countBinarySubstrings_zane_no696 = new CountBinarySubstrings_zane_NO696();
        int count = countBinarySubstrings_zane_no696.countBinarySubstrings(s);
        System.out.println(count);

    }

    public int countBinarySubstrings(String s) {
        // pre 前一个数字连续出现的次数，cur 当前数字连续出现的次数，count 结果子串个数

        int pre = 0;
        int cur = 1;
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            // 判断当前数字是否与后一个数字相同

            if (s.charAt(i) == s.charAt(i + 1)) {
                // 相同，则当前数字出现的次数cur加1
                cur++;
            } else {
                // 不同，则当前数字事实上变成了前一个数字，当前数字的次数重置为1
                pre = cur;
                cur = 1;
            }
            // 前一个数字出现的次数 >= 后一个数字出现的次数，则一定包含满足条件的子串
            if (pre >= cur) {
                count++;
            }
        }

        return count;
    }
}
