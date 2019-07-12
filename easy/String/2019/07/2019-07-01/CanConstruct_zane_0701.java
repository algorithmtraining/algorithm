package string;

public class CanConstruct_zane_0701 {



    public static void main(String[] args) {

        CanConstruct_zane_0701 canConstruct_zane_0701 = new CanConstruct_zane_0701();
        String r = "aabb";
        String m = "aab";
        boolean flag = canConstruct_zane_0701.canConstruct(r, m);
        System.out.println(flag);
    }

    /**
     * NO 383
     * 解题思路：
     * 由测试用例可知，ransomNote中的每种字符的种类和数量均不能多于magazine
     * 所以可以构造两个长度为26的数组。m,r. 分别存放ransomNote和magazine中每种字符的个数
     * 如果存在r中某种字符的数量大于m中的所对应的数量。则返回false
     * 如果正常结束，则返回true。
     * @param ransomNote
     * @param magazine
     * @return
     *
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] m = new int[26];
        int[] r = new int[26];

        for (int i = 0; i < 26; i++) {
            m[i] = 0;
            r[i] = 0;
        }

        for (int i = 0; i < magazine.length(); i++) {
            m[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            r[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (r[i] > m[i]) {
                return false;
            }
        }
        return true;
    }
}
