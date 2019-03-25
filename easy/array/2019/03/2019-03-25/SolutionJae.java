public class SolutionJae{
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high){
            int diff = target - numbers[low];
            // 右指针移动到距离目标值最近的地方
            while (low <= high && numbers[high] > diff){
                high--;
            }
            if (numbers[high] == diff){
                return new int[] {low+1, high+1};
            }else{
                low++;
            }
        }
        return new int[] {};
    }

    // nlog(n)
    public int[] twoSum2(int[] numbers, int target) {
       for (int i = 0; i < numbers.length; i++){
           if (numbers[i] <= target){
               int secondInd = binarySearch(numbers, i+1, numbers.length-1, target - numbers[i]);
               if (secondInd != -1){
                   return new int[] {i+1, secondInd+1};
               }
           }else{
               break;
           }
       }
       return new int[] {};
   }

   private int binarySearch(int[] numbers, int first, int last, int target){
       int low = first;
       int high = last;
       while (low <= high){
           int mid = low + (high - low) / 2;
           if (numbers[mid] == target){
               return mid;
           }else if (numbers[mid] > target){
               high = mid - 1;
           }else if (numbers[mid] < target){
               low = mid + 1;
           }
       }
       return -1;
   }
}
