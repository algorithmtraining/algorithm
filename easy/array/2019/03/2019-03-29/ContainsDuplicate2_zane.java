import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;

public class ContainsDuplicate2_zane {

    public static void main(String[] args) {

        int k = 3;
        int[] nums = {1,2,3,1,2,3};
        System.out.println(new ContainsDuplicate2_zane().containsNearbyDuplicate(nums, k));
    }

    /**
     * no.219.使用hashset或者hashmap都可解决此题
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(nums[i])) {
                if (Math.abs(i - aMap.get(nums[i])) < k) {
                    return true;
                }else {
                    aMap.remove(nums[i]);
                    aMap.put(nums[i], i);
                }
            }else {
                aMap.put(nums[i], i);
            }

        }

        return false;
    }
}
