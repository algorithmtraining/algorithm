package String;


/**
 * @author zane
 */
public class IsPalindrome_zane_0622 {


    public static void main(String[] args) {
        IsPalindrome_zane_0622 isPalindrome_zane_0622 = new IsPalindrome_zane_0622();
        String s = "0P";
        boolean flag = isPalindrome_zane_0622.isPalindrome(s);
        System.out.println(flag);
    }
    public boolean isPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return true;
        }

        int left = 0;
        int right = length - 1;


        while (left < right) {
            if (!isCharacter(s.charAt(left))) {
                left++;

            } else if (!isCharacter(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isCharacter(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }




}
