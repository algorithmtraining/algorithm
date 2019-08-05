/*
For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.



Example 1:

Input: A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: A = [2,1,5], K = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
Example 4:

Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000


Note：

1 <= A.length <= 10000
0 <= A[i] <= 9
0 <= K <= 10000
If A.length > 1, then A[0] != 0
 */
class Solution {
    /*溢出
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i=0; i<A.length; i++){
            a+=A[A.length-1-i]*(Math.pow(10,i));
        }
        int result = a+K;
        if(result == 0)
            list.add(0);
        while(result > 0){
            list.add(0,result%10);
            result/=10;
        }
        return list;
    }
    */
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int c=0,sum;
        int i;
        //K 和 A一起迭代
        for(i=0; i<A.length && K>0; i++){
            sum = A[A.length-1-i] + K%10 + c;
            list.add(0,sum%10);
            c = sum/10;
            K/=10;
        }
        //若数组的数组没有取完
        while(i<A.length){
            sum = A[A.length-1-i] + c;
            list.add(0,sum%10);
            c = sum/10;
            i++;
        }
        //若K各位数字没有取完
        while(K>0){
            sum = K%10 + c;
            list.add(0,sum%10);
            c = sum/10;
            K/=10;
        }
        //若有进位
        if(c==1)
            list.add(0,1);
        return list;
    }
}
/*
Runtime: 44 ms, faster than 11.64% of Java online submissions for Add to Array-Form of Integer.
Memory Usage: 41.1 MB, less than 97.80% of Java online submissions for Add to Array-Form of Integer.
 */