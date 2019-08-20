package string;

/**
 * @program: zhaozhen197->BuddyStrings_zane_NO859_0729
 * @description: NO.859 亲密字符串
 * @author: zhaozhen
 * @create: 2019-08-19 20:14
 **/
public class BuddyStrings_zane_NO859_0729 {

    public static void main(String[] args) {
        BuddyStrings_zane_NO859_0729 buddyStrings_zane_no859_0729 = new BuddyStrings_zane_NO859_0729();
        boolean a = buddyStrings_zane_no859_0729.buddyStrings("ab", "ab");
        System.out.println(a);
    }

    /**
     * NO.859 本题主要分为以下三种情况
     *
     * 字符串长度不相等, 直接返回false
     * 字符串相等的时候, 只要有重复的元素就返回true
     * A, B字符串有不相等的两个地方, 需要查看它们交换后是否相等即可.
     * @param A
     * @param B
     * @return
     */
    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()) {
            return false;
        }

        int length = A.length();

        //统计每个字符出现的个数
        int[] nums = new int[26];
        for (int i = 0; i < length; i++) {
            nums[A.charAt(i)-'a']++;
        }

        //如果两个字符串相同并且是由重复字符组成 ，返回true
        if (A.equals(B)) {
            for (int i = 0; i <26 ; i++) {
                if (nums[i] > 1) {
                    return true;
                }
            }
            return false;
        }


//        获取两个不同字符的位置
        int begin = 0;
        int end = length - 1;
        int diff1 = 0, diff2 = 0;
        while (begin < length) {
            if (A.charAt(begin) != B.charAt(begin)) {
                diff1 = begin;
                break;
            }
            begin++;
        }

        while (end >= 0) {
            if (A.charAt(end) != B.charAt(end)) {
                diff2 = end;
                break;
            }
            end--;
        }


        //互换字符后的字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == diff1) {
                stringBuilder.append(A.charAt(diff2));
            } else if (i == diff2) {
                stringBuilder.append(A.charAt(diff1));
            } else {
                stringBuilder.append(A.charAt(i));
            }
        }

        if (B.equals(stringBuilder.toString())) {
            return true;
        }
        return false;
    }



}
