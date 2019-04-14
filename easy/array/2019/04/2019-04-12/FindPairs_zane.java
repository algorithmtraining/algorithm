import java.util.HashMap;
import java.util.Map;

public class FindPairs_zane {

    public static void main(String[] args) {
        int nums[] = {3, 1, 4, 1, 5};
        int k = 0;

        System.out.println(findPairs(nums, k));
    }

    /**
     * NO.532
     * @param nums
     * @param k
     * @return
     */
    public static int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }


        Map<Integer, Integer> aMap = new HashMap<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(nums[i])) {
                aMap.put(nums[i], aMap.get(nums[i]) + 1);
            } else {
                aMap.put(nums[i], 1);
            }
        }


        if (k == 0) {
            for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
                if (entry.getValue() > 1) {
                    num++;
                }
            }

        } else {


            for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
                if (aMap.containsKey(entry.getKey() - k)) {
                    num++;
                }

            }
        }


        return num;

    }
}
