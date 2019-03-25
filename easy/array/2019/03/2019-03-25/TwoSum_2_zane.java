import java.util.HashMap;
import java.util.Map;

public class TwoSum_2_zane {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(towSum(numbers, target));

    }

    /**
     * 采用twosum1中的思路，使用map，将数组以<numbers[i],i>的方式转为map.
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] towSum(int[] numbers, int target) {

        Map<Integer, Integer> numberMap = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];
            if (numberMap.containsKey(num) && numberMap.get(num) != i) {
                return new int[]{i + 1, numberMap.get(num) + 1};
            }

        }


        return null;
    }

    /**
     * 因为numbers数组是有序自增胡，故可以采用首尾指针的方法，
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] towSum2(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return null;

    }

}
