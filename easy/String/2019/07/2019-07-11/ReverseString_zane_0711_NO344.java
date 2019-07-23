package string;

/**
 * @author zane
 */
public class ReverseString_zane_0711_NO344 {

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        ReverseString_zane_0711_NO344 reverseString_zane_0711_no344 = new ReverseString_zane_0711_NO344();
        reverseString_zane_0711_no344.reverseString(chars);
        for (char s : chars) {
            System.out.println(s);
        }
    }

    /**
     * NO 344
     * 解题思路：
     * 双指针。一个从前往后遍历，一个从后往前遍历，每次交换两个指针对应的元素。
     * @param s
     */
    public void reverseString(char[] s) {
        int length = s.length;
        int begin = 0;
        int end = length - 1;
        char temp;
        while (begin <= end) {
            temp = s[begin];
            s[begin++] = s[end];
            s[end--] = temp;
        }
    }
}
