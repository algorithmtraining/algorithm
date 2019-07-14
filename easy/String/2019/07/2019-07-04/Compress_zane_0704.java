package string;

public class Compress_zane_0704 {

    public static void main(String[] args) {
        Compress_zane_0704 compress_zane_0704 = new Compress_zane_0704();
        char[] chars = {

                'a','b','c'
        };
        compress_zane_0704.compress(chars);
    }

    /**
     * NO.443
     * 解题思路：
     * 遍历字符数组，统计每种字符的个数，如果该字符个数为1则不压缩，否则则进行压缩。
     * 在遍历的同时，使用一个指针对统计到的字符和个数放入原字符中，并记录压缩后字符数组的长度。
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        int length = chars.length;
        char temp = chars[0];
        int num = 1;
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (chars[i] == temp) {
                num++;
            }else {
                chars[index++] = temp;
                if (num > 1) {

                    String str = String.valueOf(num);
                    char[] array = str.toCharArray();
                    for (int j = 0; j < array.length; j++) {
                        chars[index++] =array[j];
                    }

                }
                temp = chars[i];
                num = 1;
            }
        }

        chars[index++] = temp;
        if (num > 1) {
            String str = String.valueOf(num);
            char[] array = str.toCharArray();
            for (int j = 0; j < array.length; j++) {
                chars[index++] = array[j];
            }

        }
        return index;
    }

}
