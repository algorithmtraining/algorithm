/*
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.

Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)

Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.

If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.



Example 1:

Input: A = [1,1], B = [2,2]
Output: [1,2]
Example 2:

Input: A = [1,2], B = [2,3]
Output: [1,2]
Example 3:

Input: A = [2], B = [1,3]
Output: [2,3]
Example 4:

Input: A = [1,2,5], B = [2,4]
Output: [5,4]


Note:

1 <= A.length <= 10000
1 <= B.length <= 10000
1 <= A[i] <= 100000
1 <= B[i] <= 100000
It is guaranteed that Alice and Bob have different total amounts of candy.
It is guaranteed there exists an answer.
 */
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0,sumB=0;
        for(int i=0; i<A.length; i++){
            sumA+=A[i];
        }
        for(int j=0; j<B.length; j++){
            sumB+=B[j];
        }
        int c;
        Map<Integer,Integer> map = new HashMap<>();
        if(sumA > sumB){
            c= (sumA-sumB)/2;
            for(int i=0; i<A.length; i++){
                map.put(A[i],A[i]);
            }
            for(int j=0; j<B.length; j++){
                if(map.get(B[j]+c)!=null)
                    return new int[]{B[j]+c,B[j]};
            }
        }else{
            c= (sumB-sumA)/2;
            for(int j=0; j<B.length; j++){
                map.put(B[j],B[j]);
            }
            for(int i=0; i<A.length; i++){
                if(map.get(A[i]+c)!=null)
                    return new int[]{A[i],A[i]+c};
            }
        }
        return null;
    }
}
/*
Runtime: 14 ms, faster than 64.45% of Java online submissions for Fair Candy Swap.
Memory Usage: 40.9 MB, less than 88.30% of Java online submissions for Fair Candy Swap.
 */