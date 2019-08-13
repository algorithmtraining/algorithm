package string;

public class ToLowerCase_zane_709_0723 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(new ToLowerCase_zane_709_0723().toLowerCase(s));
    }

    /**
     * 解题思路：
     * 根据小写字符的asii码比大写字符的asii码多32的特性，对字符串进行遍历将大写字符进行加32的操作
     * @param str
     * @return
     */
    public String toLowerCase(String str) {

        char temp;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp >= 'A' && temp <= 'Z') {
                temp = (char) (temp + 32);

            }
            stringBuilder.append(temp);
        }

        return stringBuilder.toString();
    }


}
