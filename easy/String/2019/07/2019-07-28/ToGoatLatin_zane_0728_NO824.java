package string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zane
 */
public class ToGoatLatin_zane_0728_NO824 {

    public static void main(String[] args) {
        ToGoatLatin_zane_0728_NO824 toGoatLatin_zane_0728_no824 = new ToGoatLatin_zane_0728_NO824();
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin_zane_0728_no824.toGoatLatin(s));
    }

    public String toGoatLatin(String S) {

        String[] strings = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <strings.length ; i++) {
            if (isAEIOU(strings[i])) {
                strings[i] = setAEIOU(strings[i], i + 1);
            }else {
                strings[i] = setNotAEIOU(strings[i], i + 1);
            }
            stringBuilder.append(strings[i]);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString().trim();

    }

    /**
     * 是否是元音字符
     * @param s
     * @return
     */
    public boolean isAEIOU(String s) {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        characterSet.add('A');
        characterSet.add('E');
        characterSet.add('I');
        characterSet.add('O');
        characterSet.add('U');
        return characterSet.contains(s.charAt(0));
    }

    /**
     * 如果是元音字符开头的操作
     * @param s
     * @param count
     * @return
     */
    public String setAEIOU(String s,int count) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("ma");
        for (int i = 0; i < count; i++) {
            stringBuilder.append('a');
        }

        return stringBuilder.toString();
    }

    /**
     * 不是元音字符开头的时候的操作
     * @param s
     * @param count
     * @return
     */
    public String setNotAEIOU(String s, int count) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append(stringBuilder.charAt(0));
        stringBuilder.setCharAt(0, ' ');
        stringBuilder.append("ma");
        for (int i = 0; i < count; i++) {
            stringBuilder.append('a');
        }
        return stringBuilder.toString().trim();

    }
}
