package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zane
 */
public class FirstUniqChar_zane_0712_NO387 {
    public static void main(String[] args) {
        FirstUniqChar_zane_0712_NO387 firstUniqChar_zane_0712_no387 = new FirstUniqChar_zane_0712_NO387();
        String s = "dddccdbba";
        int flage =firstUniqChar_zane_0712_no387.firstUniqChar(s);
        System.out.println(flage);
    }
    /**
     * NO387
     * 解题思路
     * 将字符串放进map中。统计每个字符的个数。如果最后某个字符的个数为1则返回该字符的索引。
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {

        Map<Character, Integer> amap = new LinkedHashMap<>();

        int temp;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (amap.get(c)!=null) {
                temp = amap.get(c);
                temp++;
                amap.put(c, temp);
            }else {
                amap.put(c, 1);
            }
        }
        int i = 0;
        char achar = ' ';
        for(Map.Entry<Character,Integer> m:amap.entrySet())
        {
            if (m.getValue() == 1) {
                achar = m.getKey();
                break;
                
            }
            i++;

        }
        if (i == s.length()) {
            return -1;
        }else {
            return  s.indexOf(achar);
        }

    }


    public int firstUniqChar2(String s) {

        Map<Character, Integer> amap = new HashMap<>();

        int temp;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (amap.get(c)!=null) {
                temp = amap.get(c);
                temp++;
                amap.put(c, temp);
            }else {
                amap.put(c, 1);
            }
        }
        for (int i = 0; i < s.length() ; i++) {
            if (amap.get(s.charAt(i)) == 1) {
                return i;
            }

        }

        return -1;

    }
}
