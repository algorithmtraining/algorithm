public class SolutionJae{
    // 使用set过滤
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int elem : nums){
            int size = set.size();
            set.add(elem);
            if (size == set.size()){
                return true;
            }
        }
        return false;
    }
}
