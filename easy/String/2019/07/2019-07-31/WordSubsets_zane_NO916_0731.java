package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: zhaozhen197->WordSubsets_zane_NO916_0731
 * @description: 单词子集
 * @author: zhaozhen
 * @create: 2019-08-21 14:41
 **/
public class WordSubsets_zane_NO916_0731 {


    public static void main(String[] args) {
        WordSubsets_zane_NO916_0731 wordSubsets_zane_no916_0731 = new WordSubsets_zane_NO916_0731();
        String[] A = {
                "amazon","apple","facebook","google","leetcode"
        };
        String[] B = {"e","eoe"};
        System.out.println(wordSubsets_zane_no916_0731.wordSubsets(A, B));
    }

    /**
     * 解题思路：
     * 本题的关键思路就是讲B中的字符串合并成为一个大的字符串。B={"e","eoe"}; 就将B合并为{"eoe"},然后统计各个字符的数量。
     *
     * @param A
     * @param B
     * @return
     */
    public List<String> wordSubsets(String[] A, String[] B) {

        List<String> strings = new ArrayList<>();

        /**
         * 将B合并成为一个大字符串
         */
        int[] Bs = new int[26];
        for (String s : B) {
            int[] bCount = getStringCharNum(s);
            for (int i = 0; i < 26; i++) {
                Bs[i] = Math.max(Bs[i], bCount[i]);
            }
        }

        //统计A中每个字符串每个字符的个数，判断该字符串是否符合要求
        int[] As;
        for (int i = 0; i < A.length; i++) {
            As = getStringCharNum(A[i]);
            int j;
            boolean flag = true;
            for (j = 0; j < As.length; j++) {
                if (Bs[j] > As[j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                strings.add(A[i]);
            }

            for (int k = 0; k < 26; k++) {
                As[k] = 0;
            }
        }

        return strings;
    }


    /**
     * 统计该字符串中每个字符的个数
     * @param A
     * @return
     */
    private int[] getStringCharNum(String A) {
        int[] As = new int[26];
        for (int j = 0; j < A.length(); j++) {
            As[A.charAt(j) - 'a']++;

        }
        return As;
    }
}
