package String;

public class AddBinary_zane_06_19 {



    public static void main(String[] args) {
        AddBinary_zane_06_19 addBinary_zane_06_19 = new AddBinary_zane_06_19();
        String res = addBinary_zane_06_19.addBinary("1", "111");
        System.out.println(res);
    }
    /**
     * NO.67
     * 解题思路：
     * 两个字符串同时进行遍历，如果一个字符串结束就跳出循环
     * 遍历过程中进行逐位以及进位相加，并产生新的进位。
     *
     * 跳出循环之后，对两个字符串的剩余字符和最后一次循环所产生的进位进行相加。
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {

        //初始的进位初始化为0
        int k = 0;
        int temp1;
        int temp2;
        int res;
        StringBuilder stringBuilder = new StringBuilder();
        int i, j;
        for ( i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; j--, i--) {
            temp1 = a.charAt(i) - '0';
            temp2 = b.charAt(j) - '0';
            res = (temp1 + temp2 + k) % 2;
            k = (temp1 + temp2 + k) / 2;
            stringBuilder.insert(0, res);
        }

        while (i >= 0) {
            temp1 = a.charAt(i) - '0';
            res = (temp1 + k) % 2;
            k = (temp1 + k) / 2;
            stringBuilder.insert(0, res);
            i--;
        }

        while (j >= 0) {
            temp2 = b.charAt(j) - '0';
            res = (temp2 + k) % 2;
            k = (temp2 + k) / 2;
            stringBuilder.insert(0, res);
            j--;
        }

        if (k != 0) {
            stringBuilder.insert(0, k);
        }

        return stringBuilder.toString();
    }

}
