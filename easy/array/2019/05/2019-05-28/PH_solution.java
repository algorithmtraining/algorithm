class Solution {  //Runtime: 3 ms, faster than 39.05% of Java online submissions for Squares of a Sorted Array.
                  //Memory Usage: 40.5 MB, less than 98.06% of Java online submissions for Squares of a Sorted Array.
                 
    public int[] sortedSquares(int[] A) {
        int[] square = new int[A.length];
        for(int i =0;i<A.length;i++)
        {
            square[i] = A[i]*A[i];
        }
         Arrays.sort(square);
        return square ;
    }
}
