package string;

/**
 * @author zane
 */
public class ReverseStr_zane_0705_NO541 {
    public static void main(String[] args) {
        ReverseStr_zane_0705_NO541 reverseStr_zane_0705_no541 = new ReverseStr_zane_0705_NO541();
        String s = "abcdabcdabcd";
        int k = 4;
        String res = reverseStr_zane_0705_no541.reverseStr(s, k);
        System.out.println(res);

    }

    /**
     * NO541
     * 解题思路：
     * 将字符串s, 分隔为长度为k。的字符串数组
     * 遍历该数组，将对应的k个字符进行反转。
     * 最后将字符串数组再转为字符串
     *
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        int length = s.length() / k;
        if (s.length() % k != 0) {
            length++;
        }
        String[] strings = new String[length];

        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                strings[i] = s.substring(i * k, s.length());
            } else {
                strings[i] = s.substring(i * k, (i + 1) * k);
            }
        }

        for (int i = 0; i < length; i = i + 2) {
            strings[i] = new StringBuilder(strings[i]).reverse().toString();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }


}
