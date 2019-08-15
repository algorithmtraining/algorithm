package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord_zane_N819_0726 {

    public static void main(String[] args) {
        MostCommonWord_zane_N819_0726 mostCommonWord_zane_n819_0726 = new MostCommonWord_zane_N819_0726();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord_zane_n819_0726.mostCommonWord(paragraph, banned));

    }

    /**
     * NO.819
     * 解题思路，本道题的难点在于对paragraph中的符号的处理。本人思路是将字符串中的所有非字母字符转变为相同的附号，然后对字符串进行分割，
     * 然后是map来保存每个单词的数量
     * 最后过滤掉禁用单词列表中的单词，并计算出现次数最多的单词
     * @param paragraph
     * @param banned
     * @return
     */

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        StringBuilder a = new StringBuilder(paragraph);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < 'a' || a.charAt(i) > 'z') {
                    a.setCharAt(i, '.');
            }
        }
        String[] words = a.toString().split("\\.");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if ( ! "".equals(words[i])) {
                String temp = words[i].trim();
                if (map.get(temp) == null) {
                    map.put(temp, 1);
                } else {
                    map.put(temp, map.get(temp) + 1);
                }
            }

        }

        int max = Integer.MIN_VALUE;
        int temp;
        String res = "";


        Set<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!set.contains(entry.getKey())) {
                temp = entry.getValue();
                if (temp > max) {
                    max = temp;
                    res = entry.getKey();
                }
            }
        }


        return res;
    }
}
