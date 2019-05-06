public class SolutionJae{
    public int findShortestSubArray(int[] nums) {
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
        // 出现度为1的情况直接返回
        if (degree == 1){
            return 1;
        }

        // 存放元素之间的距离
        Map<Integer, Integer> map1 = new HashMap<>();
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

        return minLen;
    }
}
