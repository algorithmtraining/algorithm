/*
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.



Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


Note:

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j=A.length-1;//奇数索引
        int k=A.length-2;//偶数索引
        int temp;
        for(int i=0;i<k||i<j;){//(|| 表示只要有j,k没有归位就要执行)err1:i<k&&i<j
            if(i%2==0 && A[i]%2==0 || i%2==1&&A[i]%2==1){//本身已归位，不用交换
                i++;
            }else if(A[i]%2==1){
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j-=2;
            }else if(A[i]%2==0){
                temp=A[i];
                A[i]=A[k];
                A[k]=temp;
                k-=2;
            }
        }
        return A;
    }
}
/*
Runtime: 3 ms, faster than 44.82% of Java online submissions for Sort Array By Parity II.
Memory Usage: 40.3 MB, less than 100.00% of Java online submissions for Sort Array By Parity II.
 */