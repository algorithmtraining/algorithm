package String;

public class LengthOfLastWord_zane_0609 {


    public static void main(String[] args) {
        String s = "a ";
        LengthOfLastWord_zane_0609 lengthOfLastWord_zane_0609 = new LengthOfLastWord_zane_0609();
        int num = lengthOfLastWord_zane_0609.lengthOfLastWord(s);
        System.out.println(num);

    }

    /**
     * 58
     * 解题思路：
     *
     * 1. 去掉字符串的前后空格，让后将字符串转换为字符数组
     * 2. 从后往前将字符遍历，如果碰到第一个空格就停止
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {

        int num = 0;
        s = s.trim();
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >=0; i--) {
            if (!Character.isSpaceChar(chars[i])) {
                num++;

            }else {
                break;
            }

        }
        return num;
    }


}
