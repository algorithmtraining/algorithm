/**
 * No.35 搜索插入位置
 * @author MYHE
 * @date 2019/3/29
 */
public class SearchSortedElementIndexMYHE {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int index =0;
            for (int i=0; i<nums.length; i++){
                if(nums[i] == target){
                    index=i;
                    break;
                }else{
                    if(nums[i] > target){
                        index = i;
                        break;
                    }else{
                        if((i==nums.length-1) && nums[i] < target){
                            index = i+1;
                            break;
                        }
                    }
                }
            }
            return index;
        }
    }

    public static void main(String[] args){
        SearchSortedElementIndex ssei = new SearchSortedElementIndex();
        Solution solution = ssei.new Solution();
        int[] nums = {1,3,5,6};
        int target = 7;
        int res = solution.searchInsert(nums, target);
        System.out.println(res);
    }
}
