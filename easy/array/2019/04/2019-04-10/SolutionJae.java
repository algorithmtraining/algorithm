public class SolutionJae{
    public int findMaxConsecutiveOnes(int[] nums) {
       int max = 0;
       int sum = 0;
       for (int i = 0; i < nums.length; i++){
           if (nums[i] == 1){
               sum++;
           }else{
               max = Math.max(max, sum);
               sum = 0;
           }
       }
       return Math.max(max, sum);
   }
}
