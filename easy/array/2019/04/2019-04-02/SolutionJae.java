public class SolutionJae {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length){
            if (nums[slow] != 0 && nums[fast] != 0){
                nums[slow++] = nums[fast++];
            }else if (nums[slow] == 0 && nums[fast] == 0){
                fast++;
            }else{
                nums[slow++] = nums[fast];
                nums[fast++] = 0;
            }
        }
    }
}
