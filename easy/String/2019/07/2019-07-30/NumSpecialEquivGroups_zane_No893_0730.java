package string;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: zhaozhen197->NumSpecialEquivGroups_zane_No893_0730
 * @description: NO.893 特殊等价字符串
 * @author: zhaozhen
 * @create: 2019-08-20 10:02
 **/
public class NumSpecialEquivGroups_zane_No893_0730 {

    public static void main(String[] args) {
        String[] strings = {
                "abcd", "cdab", "adcb", "cbad"
        };

        NumSpecialEquivGroups_zane_No893_0730 numSpecialEquivGroups = new NumSpecialEquivGroups_zane_No893_0730();
        System.out.println(numSpecialEquivGroups.numSpecialEquivGroups(strings));
    }

    /**
     * 解题思路： 如果奇数位置和偶数位置上的字符都是相同组合的话，则符合要求
     * 例如：abcde、cdabe，两者奇数位上均是a/c/e，偶数位上都是b/d， 则他们可以通过任意次的交换得到等价字符串
     * <p>
     * 所以算法思路是：将字符串的奇数位上的字符都取出来，然后将偶数位上的字符取出来放到set中，返回set的个数。
     *
     * @param A
     * @return
     */
    public int numSpecialEquivGroups(String[] A) {

        Set<String> stringSet = new HashSet<>();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        char[] chars1;
        char[] chars2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                if ((j + 1) % 2 == 1) {
                    stringBuilder1.append(A[i].charAt(j));
                } else {
                    stringBuilder2.append(A[i].charAt(j));
                }
            }
            chars1 = stringBuilder1.toString().toCharArray();
            chars2 = stringBuilder2.toString().toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            stringSet.add(new String(chars1) + new String(chars2));
            stringBuilder1.delete(0, stringBuilder1.length());
            stringBuilder2.delete(0, stringBuilder2.length());
        }

        return stringSet.size();
    }

}
