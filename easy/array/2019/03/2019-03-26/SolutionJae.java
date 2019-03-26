public class SolutionJae{
    // 耗时
    public int majorityElement(int[] nums){
     Map<Integer, Integer> map = new HashMap<>();
     int size = nums.length;

     for (int elem : nums){
         map.put(elem, map.getOrDefault(elem, 0) + 1);
         if (size / 2 < map.get(elem)){
             return elem;
         }
     }
     return -1;
 }
}
