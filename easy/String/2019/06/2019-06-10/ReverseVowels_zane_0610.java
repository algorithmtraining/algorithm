package String;

import java.util.HashMap;

public class ReverseVowels_zane_0610 {


    public static void main(String[] args) {
        String s = "leetcode";

        ReverseVowels_zane_0610 reverseVowels_zane_0610 = new ReverseVowels_zane_0610();
        String s1 = reverseVowels_zane_0610.reverseVowels(s);
        System.out.println(s1);
    }
    /**
     * No.345
     * 解题思路：
     * 1. 两个指针，第一个从都开始遍历找到元音字母停止
     * 2. 第二个指针从后往前遍历找到元音字母停止
     * 3. 交换两个指针所对应的元素
     * 4. 循环退出条件为i<=j
     *
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int i=0;
        int j = chars.length - 1;

        while (i < chars.length && j >= 0 && i <j) {

            if (isVowels(chars[i] )== -1) {
                i++;
            }

            if (isVowels(chars[j] )== -1) {
                j--;
            }

            if (isVowels(chars[i]) != -1 && isVowels(chars[j]) != -1) {
                swap(chars, i, j);
                i++;
                j--;
            }


        }
        return String.valueOf(chars);
    }

    private int isVowels(char a) {
        String s = "aeiouAIOUE";
        return s.indexOf(a);
    }

    private void swap(char[] A, int i, int j) {
        char temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
