/*
Given an array A of non-negative integers,
return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j=A.length-1;
        int temp;
        for(int i=0; i<j; )
        {
            if(A[i]%2==1)
            {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j--;
            }else
            {
                i++;
            }
        }
        return A;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.9 MB, less than 93.99% of Java online submissions for Sort Array By Parity.
 */