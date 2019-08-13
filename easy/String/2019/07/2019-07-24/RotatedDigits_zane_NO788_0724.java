package string;

import java.util.HashMap;
import java.util.Map;

public class RotatedDigits_zane_NO788_0724 {

    public static void main(String[] args) {
        RotatedDigits_zane_NO788_0724 rotatedDigits = new RotatedDigits_zane_NO788_0724();
        System.out.println(rotatedDigits.rotatedDigits(10));

    }

    /**
     * NO.788
     * 解题思路：如果存在无效数字或者转换后与之前的数字相同则不统计个数。
     *
     * 将数字转换为字符串进行处理，有效数字字符以及转换后的字符可用一个map进行存储，计算出每个有效数字的转换后的数字，如果两个数字不相同则进行统计。
     *
     * @param N
     * @return
     */
    public int rotatedDigits(int N) {
        Map<Character,Character> map = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        init(map);

        int sum = 0;
        for (int j = 1; j <=N ; j++) {
            String s = String.valueOf(j);
            if (isValid(s)) {
                for (int i = 0; i < s.length(); i++) {
                    char temp = s.charAt(i);
                    stringBuilder.append(map.get(temp));
                }
                if (!s.equals(stringBuilder.toString())) {
                    sum++;
                }
                stringBuilder.delete(0, stringBuilder.length());
            }
        }


        return sum;
    }

    /**
     * 如果字符串中村子无效字符，返回false
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '3' || temp == '4' || temp == '7') {
                return false;
            }
        }
        return true;
    }

    /**
     * 将字符转换信息使用map进行处理
     * @param map
     */
    public void init(Map map) {
        map.put('0', '0');
        map.put('1', '1');
        map.put('2', '5');
        map.put('5', '2');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
    }


}
