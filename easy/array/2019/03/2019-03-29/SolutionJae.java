public class SolutionJae{
    public boolean containsNearbyDuplicate3(int[] nums, int k) {
       Set<Integer> set = new HashSet<>();
       for (int i = 0; i < nums.length; i++){
           // 滑动窗口
           if (i > k){
               set.remove(nums[i-k-1]);
           }
           // 添加已存在的元素会返回false，且在窗口内
           if (!set.add(nums[i])){
               return true;
           }
       }

       return false;
   }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int preIndex = map.getOrDefault(nums[i], -k-1);
            if (i - preIndex <= k){
                return true;
            }
            // 前一次的值不满足就直接覆盖掉，该值对问题的解无任何影响
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                if (i - map.get(nums[i]) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
