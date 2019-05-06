import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray_zane {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        FindShortestSubArray_zane findShortestSubArray = new FindShortestSubArray_zane();
        System.out.println(findShortestSubArray.findShortestSubArray(nums));

    }

    /**
     * No.697 数组的度
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> aMap = new HashMap<>();
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(nums[i])) {
                temp = aMap.get(nums[i]);
                temp++;
            }
            aMap.put(nums[i], temp);
            temp = 1;
        }

        int max = aMap.get(nums[0]);
        int key = nums[0];
        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() != max) {
                aMap.put(entry.getKey(), Integer.MIN_VALUE);
            }
        }

        int min = Integer.MAX_VALUE;
        int templength;
        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() != Integer.MIN_VALUE) {
                templength = lengthOfSubarray(nums, entry.getKey());
                if (templength < min) {
                    min = templength;
                }
            }

        }


        return min;
    }


    public int lengthOfSubarray(int[] nums, int key) {

        int tempi = Integer.MIN_VALUE;
        int tempj = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                tempi = i;
                break;
            }

        }

        for (int j = nums.length - 1; j >= 0; j--) {

            if (nums[j] == key) {
                tempj = j;
                break;
            }

        }
        return tempj - tempi + 1;
    }
    public int findShortestSubArray1(int[] nums) {
        int[] mark = new int[50000];

        int degree = 0;
        int minLen = nums.length;

        for (int elem : nums){
            mark[elem]++;
        }

        for (int i= 0; i < mark.length; i++){
            if (mark[i] == 0){
                continue;
            }
            degree = Math.max(degree, mark[i]);
        }
        if (degree == 1){
            return 1;
        }

        int min = Integer.MAX_VALUE;
        int templength;


        for (int i= 0; i < mark.length; i++) {

            if (mark[i] == degree) {
                templength = lengthOfSubarray(nums, i);
                if (min > templength) {
                    min = templength;
                }
            }

        }
        return min;
/*//        System.out.println("最大度为 " + degree);

        // 存放元素之间的距离
//        Map<Integer, Integer> map1 = new HashMap<>();
        // 存放元素出现的次数
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int count = map2.getOrDefault(nums[i], 0) + 1;
            if (count == 1){
                // 首次出现
                map1.put(nums[i], i);
            }else if (count == degree){
                // 最后一次出现
                int len = i - map1.get(nums[i]) + 1;
                minLen = Math.min(len, minLen);
                map1.put(nums[i], minLen);
            }
            map2.put(nums[i], count);
        }

        return minLen;*/
    }

}
