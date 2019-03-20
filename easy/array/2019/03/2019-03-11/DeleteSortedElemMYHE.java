/**
 * No.26 删除有序数组重复元素
 * @author MYHE
 * @date 2019/3/20
 */
public class DeleteSortedElemMYHE {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 0;
            int len = nums.length;
            if(len == 1){
                return 1;
            }
            for(int i = 0 ; i < nums.length ; i ++){
                if(i == len - 1){
                    count ++;
                    break;
                }else {
                    if (nums[i] == nums[i + 1]) {
                        for (int j = i + 1; j < nums.length - 1; j++) {
                            nums[j] = nums[j + 1];
                        }
                        len--;
                        i --;
                    } else {
                        count++;
                    }
                }

            }
            return count;
        }
    }
    public static void main(String[] args) {
        DeleteSortedElem dse = new DeleteSortedElem();
        Solution solution = dse.new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int res = solution.removeDuplicates(nums);
        System.out.println(res);
    }
}
