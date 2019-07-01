package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_zane_0602 {



    public static void main(String[] args) {
        String s = "LVIII";
        RomanToInt_zane_0602 romanToInt = new RomanToInt_zane_0602();
        int res = romanToInt.romanToInt(s);
        System.out.println( res
        );



    }

    /**
     * 解题思路：
     * 1. 先将罗马数字以map的形式存放起来，
     * 2. 将罗马数字串转为整形数组如： "IV" => [1,5]
     * 3. 从后往前遍历数组如果左边的数字小于右边的将右边的数字减去左边的数字值，如果左边的数字比右边的数字大或者相等，则相加。
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {


        Map<Character,Integer> amap =  romanToIntByMap();
        char[] chars= s.toCharArray();
        if (chars.length <= 0) {
            return 0;
        }
        //将罗马字符串转为整型数组
        int[] arr = new int[chars.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = amap.get(chars[i]);
        }

        int j =arr.length - 2;
        int result = arr[arr.length-1];
        while (j >=0) {

            if (arr[j] >= arr[j + 1]) {
                result += arr[j];
            } else {
                result -= arr[j];
            }

            j--;
        }

        return result;
    }

    //返回罗马数字和整型相对照的map


    private Map<Character,Integer> romanToIntByMap() {
        Map<Character, Integer> aMap = new HashMap<>();
        aMap.put('I', 1);
        aMap.put('V', 5);
        aMap.put('X', 10);
        aMap.put('L', 50);
        aMap.put('C', 100);
        aMap.put('D', 500);
        aMap.put('M', 1000);
        return aMap;
    }

}
