public class SolutionJae {
    // Method1: use map
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int elem : nums){
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int diff1 = entry.getKey() - k;
            int diff2 = entry.getKey() + k;
            if (diff1 == diff2){
                if (entry.getValue() >= 2){
                    count+=2;
                }
                continue;
            }
            if (map.containsKey(diff1)){
                count++;
            }
            if (map.containsKey(diff2)){
                count++;
            }
        }

        return count / 2;
    }
}
