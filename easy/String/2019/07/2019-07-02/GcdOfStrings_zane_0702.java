package string;

/**
 * @author zane
 */
public class GcdOfStrings_zane_0702 {
    /**
     * NO.1071
     * 解题思路：
     * 长度较长的字符串减去较短的字符串。形成新的长串和短串，然后再减。
     * 在长串中查找短串的索引，如果索引为0.将长串减去短串，并形成新的长串和短串。否则返回""
     * 如果循环正常结束时两个串相等，则符合要求
     *
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "";
        }

        String longStr = str1.length() > str2.length() ? str1 : str2;
        String shortStr = str1.length() > str2.length() ? str2: str1;

        while (longStr.length() != shortStr.length()) {
            if (longStr.indexOf(shortStr) == 0) {
                String tempStr = longStr.substring(shortStr.length(), longStr.length());
                longStr = tempStr.length() > shortStr.length() ? tempStr : shortStr;
                shortStr = tempStr.length() > shortStr.length() ? shortStr : tempStr;
            }else {
                return "";
            }
        }

        if (shortStr.equals(longStr)) {
            return longStr;
        }

        return "";
    }



}
