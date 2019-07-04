package String;

public class DetectCapitalUse_zane_0613 {

    /**
     *No.520
     * 解题思路：
     * 1. 统计单词中的大写字母的个数 num
     * 2. 如果num大于单词的长度返回false，
     * 3. 如果num等于1并且第一个字符为大写且单词长度大于1返回true
     * 4. 如果num等于单词的长度返回true
     * 5. 如果num等于0 并且单词长度不为0
     *
     * 时间复杂度为O(n);
     *
     * @param word
     * @return
     */


    public boolean detectCapitalUse(String word) {

        int length = word.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                num++;
            }
        }

        if (num == length && length >= 1) {
            return true;
        } else if (num == 0 && length >= 1) {
            return true;
        }else if (num ==1 && word.charAt(0)>= 'A' && word.charAt(0) <= 'Z' && length >1){
            return true;
        }

        return false;
    }
}
