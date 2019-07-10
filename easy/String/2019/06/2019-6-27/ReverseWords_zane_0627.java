package String;

/**
 * @author zane
 */
public class ReverseWords_zane_0627 {


    public static void main(String[] args) {
        ReverseWords_zane_0627 reverseWords_zane_0627 = new ReverseWords_zane_0627();
        String s = "Let's take LeetCode contest";
        String t = reverseWords_zane_0627.reverseWords(s);
        System.out.println(t);

    }
    /**
     * NO.557
     * 解题思路：
     *遍历字符串s,每个单词都是用空格隔开的
     * 遍历过程使用分别left记录一个单词的开始,right 记录单词的结束，然后对这个单词进行反转。
     * 如果是空格则i++
     *
     *
     * 单词反转函数的思路。
     * 使用前后两个指针来进行交换，临界条件是i<=j
     *
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;

        int left=0, right;
        for (int i = 0; i < length;i++) {
            if (i == 0 || (Character.isSpaceChar(chars[i - 1]) && i >= 1)) {
                left = i;
            }
            if (Character.isSpaceChar(chars[i])) {
                right = i - 1;
                revers(chars, left, right);
            }

            if (i == length - 1) {
                right = i;
                revers(chars, left, right);
            }
        }

        return String.valueOf(chars);
    }

    public void revers(char[] chars, int left, int right) {

        char temp;
        while (left < right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            right--;
            left++;
        }
    }

   
}
