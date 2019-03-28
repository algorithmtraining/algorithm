public class SolutionJae{
    // 一次性将元素挪动到指定位置
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // 挪动过的个数
        int count = 0;
        for (int start = 0; count < nums.length; start++){
            // 当前下标
            int current = start;
            // 前一个值
            int prev = nums[start];
            do{
                int next = (current + k) % nums.length;
                int now = nums[next];
                nums[next] = prev;
                current = next;
                count++;
            } while (start != current);
        }
    }
    // 每次需要挪动n-1个值,耗时
    public void rotate2(int[] nums, int k) {
        k = k % nums.length;

        for (int i = 0; i < k; i++){
            int start = 0;
            int end = nums.length - 1;
            int frontValue = nums[start];
            int tmp;
            nums[start] = nums[end];

            do{
                tmp = nums[start+1];
                nums[++start] = frontValue;
                frontValue = tmp;
            }while (start != end);
        }
    }
}
