package string;

public class RepeatedSubstringPattern_zane_0715 {
    public static void main(String[] args) {
        String s = "abab";
        RepeatedSubstringPattern_zane_0715 repeatedSubstringPattern_zane_0715 = new RepeatedSubstringPattern_zane_0715();
        boolean flag = repeatedSubstringPattern_zane_0715.repeatedSubstringPattern(s);
        System.out.println(flag);
    }
    public boolean repeatedSubstringPattern(String s) {

        int len = s.length();
        int t = 0;
        int i = 0;
        for (t = 1; t <= len / 2; t++) {
            if (len % t != 0) {

                continue;
            }

            for (i = t; i < len && s.charAt(i % t) == s.charAt(i); i++);

            if (i == len) {
                return true;
            }
        }

        return false;
    }
}
