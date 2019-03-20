/**
 * No.27 删除特定元素
 * @author 何明扬
 * @date 2019/3/20
 */
public class DeleteSpecificElementMYHE {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int head = 0;
            int length = nums.length;
            int end = length-1;
            int count = 0;
            while( head <= end){
                if(nums[head] == val && nums[end] != val){
                    nums[head++] = nums[end];
                    nums[end--] = val;
                    count ++;
                }else{
                    if(nums[head] == val && nums[end] == val){
                        end--;
                    }else{
                        if(nums[head] != val){
                            head ++;
                            count ++;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args){
        DeleteSpecificElement dse = new DeleteSpecificElement();
        Solution solution = dse.new Solution();
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int res = solution.removeElement(nums, val);
        System.out.println(res);
    }

}
