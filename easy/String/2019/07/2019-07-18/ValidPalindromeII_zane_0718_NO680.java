package string;

/**
 * @author zane
 */
public class ValidPalindromeII_zane_0718_NO680 {


    public static void main(String[] args) {
        String s = "abc";
        ValidPalindromeII_zane_0718_NO680 validPalindromeII_zane_0718_no680 = new ValidPalindromeII_zane_0718_NO680();
        boolean flag = validPalindromeII_zane_0718_no680.validPalindrome(s);
        System.out.println(flag);
    }

    /**
     * 采用双指针来验证回文子串，如果不相等的时候，从左边跳过一个字符，或者从右边跳过一个字符。
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int length = s.length();
        boolean flag = false;
        boolean res1 = true;
        boolean res2 = true;
        int i, j;
        for (i = 0, j = length - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                if (!flag) {
                    if (s.charAt(i) == s.charAt(j - 1)) {
                        j--;
                        flag = true;
                    }else {
                        res1 = false;
                        break;
                    }
                } else {
                    res1 = false;
                    break;
                }
            }
        }

        flag = false;
        for (i = 0, j = length - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                if (!flag) {
                    if (s.charAt(i + 1) == s.charAt(j)) {
                        i++;
                        flag = true;
                    }else {
                        res2 = false;
                        break;
                    }
                } else {
                    res2 = false;
                    break;

                }
            }
        }



        if (res1 || res2) {
            return true;
        } else {
            return false;
        }

    }


}
