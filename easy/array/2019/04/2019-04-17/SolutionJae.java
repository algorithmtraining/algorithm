public class Solution {
    public int maximumProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int elem : nums){
            if (elem < firstMin){
                secondMin = firstMin;
                firstMin = elem;
            }else if (elem < secondMin){
                secondMin = elem;
            }

            if (elem > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = elem;
            }else if (elem > secondMax){
                thirdMax = secondMax;
                secondMax = elem;
            }else if (elem > thirdMax){
                thirdMax = elem;
            }
        }
        return Math.max(firstMin*secondMin*firstMax, firstMax*secondMax*thirdMax);
    }
}
