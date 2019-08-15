package string;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations_zane_No804_0725 {

    public static void main(String[] args) {
        UniqueMorseRepresentations_zane_No804_0725 uniqueMorseRepresentations = new UniqueMorseRepresentations_zane_No804_0725();
        String[] s = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations.uniqueMorseRepresentations(s));
    }


    /**
     * No804
     * 解题思路：
     * 将words中的每个字符串分别转换为摩尔斯密码，添加到set集合中，利用set集合不能存储重复字符串的特性来统计个数
     * @param words
     * @return
     */
    public int uniqueMorseRepresentations(String[] words) {

        String[] s = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };


        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(change(words[i], s));
        }

        return set.size();
    }

    /**
     * 将字母字符串转换为摩尔说密码字符串
     * @param s
     * @param inits
     * @return
     */
    public String change(String s, String[] inits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            stringBuilder.append(inits[temp - 'a']);
        }
        return stringBuilder.toString();
    }
}
