package String;

public class StrStr_zane_0603 {

    public static void main(String[] args) {
        String b = "a";
        String a = "a";
        StrStr_zane_0603 strStr_zane_0603 = new StrStr_zane_0603();

       int res =  strStr_zane_0603.strStr(a, b);
        System.out.println(res);

    }
    /**
     * 暴力破解
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (h <= 0 && n <= 0) {
            return -1;
        }
        for (int i = 0; i < h - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }

        }

        return -1;

    }





/**
 * kmp算法，让前面匹配的结果指导后面开始的匹配。
 * 1.求模式串needle的nexts数组。
 *    前缀：从第一个元素开始不包含末尾元素的子串；后缀：从最后一个元素开始不包含头元素的子串。
 *    比如字符串abc，前缀可以是a或者ab，后缀可以是c或者bc
 *    最长公共元素：前缀与后缀相同并且保证长度最长，ababab的最长前缀为abab，
 *    前缀和后缀允许包含相同的元素但不能完全相同。
 *    具体步骤如下
 *    1)下标为0，1位置的nexts元素固定为-1，0
 *    2)nexts数组当前下标为i，假设在这个下标之前的nexts数组元素都正确，i-1位置的next数组元素为n，n即为i-1的最长前缀
 *       如果i-1位置的最长前缀的下一个元素和i-1位置的元素相同，那么i位置的最长前缀为n+1.否则继续找i-1位置的最长前缀的
 *       最长前缀的下一个元素和i-1位置的元素是否相同，每次都这样找，直到找到或者找不到为止。找到的话最长前缀为找到时候的前缀
 *       长度+1，否则就为0(即没有最长前缀)。
 *       如ababcababe，需要找e位置的最长前缀。已知e之前的next数组对应为[-1,0,0,1,2,0,1,2,3,n]。求n
 *       用i表示当前e元素的下标，i-1就是e前一个位置的下标。i-1对应的元素b存在最长前缀aba。aba的下一个元素b和i-1位置的b相同
 *       则n就是它前一个元素的最长前缀3加上1，所以n=4.
 * 2.主串haystack与needle开始匹配。
 *       haystack的m位置和needle的n位置不匹配，但n之前的元素都匹配，只需要找到n的最长前缀k，下一次匹配从m位置和k的下一个元素进行匹配
 */

    public int strStr1(String haystack, String needle) {
        //如果needle为空，则返回0
        if(needle.length()<1){
            return 0;
        }
        if(haystack == null || needle == null || haystack.length() < 1 || needle.length() < 1){
            return -1;
        }

        //主字符串haystack的下标
        int index1 = 0;
        //模式串needle的下标
        int index2 = 0;
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();
        //获得nexts数组
        int[] nexts = getNexts(char2);
        while(index1 < char1.length && index2 < char2.length){
            if(char1[index1] == char2[index2]){
                index1++;
                index2++;
            }else if(nexts[index2] == -1){//如果为第一位都不匹配则直接下一个字符
                index1++;
            }else{
                index2 = nexts[index2];
            }
        }
        return index2 == char2.length ? index1 - index2 : -1;
    }


    //获得next数组
    public int[] getNexts(char[] str2){
        if(str2.length == 1){
            return new int[]{-1};
        }
        int[] nexts = new int[str2.length];
        nexts[0] = -1;
        nexts[1] = 0;
        //指向当前元素最长前缀的指
        int cn = 0;
        //遍历字符串时的下标
        int index = 2;
        while(index < str2.length){
            if(str2[index - 1] == str2[cn]){
                nexts[index++] = ++cn;
            }else if(cn > 0){
                cn = nexts[cn];
            }else{
                nexts[index++] = 0;
            }
        }
        return nexts;
    }
}
