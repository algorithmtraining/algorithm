/*
A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).



Example 1:

Input: [[4,3,8,4],
        [9,5,1,9],
        [2,7,6,2]]
Output: 1
Explanation:
The following subgrid is a 3 x 3 magic square:
438
951
276

while this one is not:
384
519
762

In total, there is only one magic square inside the given grid.
Note:

1 <= grid.length <= 10
1 <= grid[0].length <= 10
0 <= grid[i][j] <= 15
 */
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length<3 || grid[0].length<3) return 0;
        int result=0;
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<grid.length-1;i++){
            for(int j=1; j<grid[0].length-1;j++)
            {
                //判重 ERR1
                boolean isDistinct = true;
                set.add(grid[i][j-1]);
                set.add(grid[i][j]);
                set.add(grid[i][j+1]);
                set.add(grid[i-1][j-1]);
                set.add(grid[i-1][j]);
                set.add(grid[i-1][j+1]);
                set.add(grid[i+1][j-1]);
                set.add(grid[i+1][j]);
                set.add(grid[i+1][j+1]);
                if(set.size()!=9){
                    isDistinct = false;
                }
                //大小 1-9
                boolean isInOneToNine = true;
                for(Integer num:set)
                {
                    if(num>9 || num<1)
                        isDistinct = false;
                }
                set.clear();
                if(!(isDistinct && isInOneToNine))
                    continue;
                //三横 //三竖 //两对角线
                int sum = grid[i][j-1]+grid[i][j]+grid[i][j+1];
                if(sum == grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1] &&
                        sum == grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1] &&

                        sum == grid[i-1][j]+grid[i][j]+grid[i+1][j] &&
                        sum == grid[i-1][j-1]+grid[i][j-1]+grid[i+1][j-1] &&
                        sum == grid[i-1][j+1]+grid[i][j+1]+grid[i+1][j+1] &&

                        sum == grid[i-1][j-1]+grid[i][j]+grid[i+1][j+1] &&
                        sum == grid[i-1][j+1]+grid[i][j]+grid[i+1][j-1]
                )
                    result++;
            }
        }
        return result;
    }
}
/*
Runtime: 3 ms, faster than 7.28% of Java online submissions for Magic Squares In Grid.
Memory Usage: 35.9 MB, less than 91.11% of Java online submissions for Magic Squares In Grid.
 */