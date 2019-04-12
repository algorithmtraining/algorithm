public class SolutionJae {
    public int arrayPairSum(int[] nums) {
     int[] mark = new int[2*10000 + 1];

     for (int elem : nums){
         mark[elem+10000]++;
     }

     int sum = 0;
     boolean flag = true;
     for (int i = 0; i < mark.length; i++){
         while (mark[i] > 0){
             if (flag){
                 sum += (i - 10000);
             }
             flag = !flag;
             mark[i]--;
         }
     }

     return sum;
 }
}
