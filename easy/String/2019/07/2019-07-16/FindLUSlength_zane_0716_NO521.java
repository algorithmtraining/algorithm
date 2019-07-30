package string;

public class FindLUSlength_zane_0716_NO521 {

    /**
     * No521
     * 解题思路：如果两个字符串不相同，则长的那个字符串的最大子串就是它本身。如果两个字符串相同，则返回-1
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {

        if (a!=null && !a.equals(b)) {
            return a.length() > b.length() ? a.length() : b.length();

        }else {
            return -1;
        }
    }
}
