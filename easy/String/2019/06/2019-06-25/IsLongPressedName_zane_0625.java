package String;

public class IsLongPressedName_zane_0625 {

    public static void main(String[] args) {
        IsLongPressedName_zane_0625 isLongPressedName_zane_0623 = new IsLongPressedName_zane_0625();
        String name = "pyplrz";
        String typed = "ppyypllr";

        boolean flag = isLongPressedName_zane_0623.isLongPressedName(name, typed);
        System.out.println(flag);

    }

    /**
     * NO.925
     * 解题思路：
     * 同时遍历name 和 typed,name中的每个字符，在typed中可以有多个。
     * 在遍历的时候使用 namechar 和 num1，来记录name连续的相同的字符的个数。
     * 使用 typechar 和num2 来记录typede中连续的相同的字符的个数
     * 如果typedchar  和namechar相等并且 num2 >= num1 则说明该输入是正确的
     *
     * @param name
     * @param typed
     * @return
     */
    public boolean isLongPressedName(String name, String typed) {
        int num1;
        int num2;
        char nameChar,typedChar;

        int lengthName = name.length();
        int lengthTyped = typed.length();
        int i = 0;
        int j = 0;
        while (i < lengthName && j <lengthTyped) {
            num1 = 1;
            nameChar = name.charAt(i);
            i++;
            while (i<lengthName&&nameChar == name.charAt(i)) {
                num1++;
                i++;
            }

            typedChar = typed.charAt(j);
            num2 = 1;
            j++;
            while (j < lengthTyped && typedChar == typed.charAt(j)) {
                num2++;
                j++;
            }

            if (typedChar != nameChar || num1 > num2) {
                return false;
            }
        }

        if (i < lengthName || j < lengthTyped) {
            return false;
        }

        return true;
    }


}
