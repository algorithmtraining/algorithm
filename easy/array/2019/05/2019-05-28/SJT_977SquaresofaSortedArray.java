/*
Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
 */
class Solution {
    public int[] sortedSquares(int[] A) {
        //解法1：每个值取平方后，排序 略
        for(int i=0; i<A.length; i++)
            A[i]*=A[i];
        Arrays.sort(A);
        return A;
    }
}
/*
Runtime: 2 ms, faster than 70.56% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.9 MB, less than 96.33% of Java online submissions for Squares of a Sorted Array.
 */
class Solution {
    //看了赵振的解法
    public int[] sortedSquares(int[] A) {
        for(int i=0; i<A.length; i++)
            A[i]*=A[i];
        int i=0,j=A.length-1,k=A.length-1;
        int[] B = new int[A.length];
        while(i<=j){
            if(A[i]<A[j]){
                B[k--]=A[j--];
            }else{
                B[k--]=A[i++];
            }
        }
        return B;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
        Memory Usage: 40.4 MB, less than 97.55% of Java online submissions for Squares of a Sorted Array.
 */