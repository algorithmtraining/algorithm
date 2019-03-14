/**
 * NO.1 两数之和
 * @author MYHE
 * @date 2019/3/14
 */
public class TwoSumMYHE {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int begin=0;
            int end=0;
            boolean flag = false;
            for(int i=0; i< nums.length; i ++){
                begin = i;
                for(int j=i+1; j<nums.length; j++){
                    if(target - nums[i] == nums[j]){
                        end = j ;
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            return new int[]{begin, end};
        }
    }

    public static void main(String[] args){
        TwoSumMYHE ts = new TwoSumMYHE();
        Solution s = ts.new Solution();
        int[] nums = new int[]{3, 2, 4};
        int[] res = s.twoSum(nums, 6);
        System.out.println(res);
    }
}
