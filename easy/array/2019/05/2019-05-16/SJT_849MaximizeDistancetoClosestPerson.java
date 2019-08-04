/*
In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.

Return that maximum distance to closest person.

Example 1:

Input: [1,0,0,0,1,0,1]
Output: 2
Explanation:
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
Example 2:

Input: [1,0,0,0]
Output: 3
Explanation:
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
Note:

1 <= seats.length <= 20000
seats contains only 0s or 1s, at least one 0, and at least one 1.
 */
class Solution {
    public int maxDistToClosest(int[] seats) {
        int left1=-1,right1=-1;//左边右边没有1
        int maxDistance = 0;
        for(int i=0; i<seats.length; i++){
            //如果座位上没人，尝试坐下来，看看距离最近的人多远
            if(seats[i]==0){
                for(left1=i-1;left1>=0&&seats[left1]==0;left1--);//找到0左边的一个1(往左边瞅瞅看有没有人)
                for(right1=i+1;right1<seats.length&&seats[right1]==0;right1++){};//找到0右边的一个1位置(右边瞅瞅)
                if(left1==-1){//左边没有1，坐到最左边试试
                    maxDistance = Math.max(maxDistance,right1-i);//不是right1-left1 err1
                }else if(right1==seats.length){//右边没有1，坐到最右边试试
                    maxDistance = Math.max(maxDistance,right1-1-left1);
                }else{//两边都有1，坐到中间
                    maxDistance = Math.max(maxDistance,(right1-left1)/2);
                }
                i=right1;
            }
        }
        return maxDistance;
    }
}
/*
Runtime: 2 ms, faster than 91.54% of Java online submissions for Maximize Distance to Closest Person.
Memory Usage: 38.5 MB, less than 98.51% of Java online submissions for Maximize Distance to Closest Person.
 */