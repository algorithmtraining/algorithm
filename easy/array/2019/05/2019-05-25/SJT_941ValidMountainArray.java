/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Valid Mountain Array.
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        int i,j;
        for(i=0; i<A.length-1&&A[i]<A[i+1]; i++);
        for(j=A.length-1;j>0&&A[j-1]>A[j];j--);
        if(i==j && i!=0&&i!=A.length-1) return true;//err1:少了后面两个条件（0,1,2,3,4,5,6 通过不了）
        return false;
    }
}
/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]


Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true


Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000
 */