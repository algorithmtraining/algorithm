package string;

public class AddStrings_zane_0714_No415 {

    public static void main(String[] args) {

    }
    /**
     * NO。415
     * 解题思路：
     *将两个数组从后往前同时遍历，对每个对应的字符和金位数进行相加，保留新的余数和进位数，将余数放到一个新的字符串中。跳出循环之后，
     * 将没有遍历完全的数组的每个字符和进位数相加，最后判读进位数是否为0.如果不为0将进位数放进字符串中
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int mot=0;
        int lowd = 0;
        int temp1 = 0;
        int temp2 = 0;
        int sum1 = 0;
        int i, j;
        StringBuilder stringBuilder = new StringBuilder();
        for (i = length1 - 1, j = length2 - 1; i >= 0 && j >= 0; i--, j--) {
            temp1 = num1.charAt(i) - '0';
            temp2 = num2.charAt(j) - '0';
            sum1 = temp1 + temp2 + mot;
            mot = sum1 / 10;
            lowd = sum1 % 10;
            stringBuilder.insert(0, lowd);
        }

        while (i >= 0) {
            temp1 = num1.charAt(i) - '0';
            sum1 = temp1 + mot;
            mot = sum1 / 10;
            lowd = sum1 % 10;
            stringBuilder.insert(0, lowd);
            i--;
        }
        while (j >= 0) {
            temp2 = num2.charAt(j) - '0';
            sum1 = temp2 + mot;
            mot = sum1 / 10;
            lowd = sum1 % 10;
            stringBuilder.insert(0, lowd);
            j--;
        }

        if (mot > 0) {
            stringBuilder.insert(0, mot);
        }
        return stringBuilder.toString();

    }


}
