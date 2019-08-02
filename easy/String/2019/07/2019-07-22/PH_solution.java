/**
*算法思路：将字符串相邻相同的个数存到数组里，结果即为相邻数组中最小值的和
*Runtime: 13 ms, faster than 64.24% of Java online submissions for Count Binary Substrings.
*Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Count Binary Substrings.
**/


class Solution {
    public int countBinarySubstrings(String s) {
       char [] ss = s.toCharArray();
        int count = 1;
        int [] count2 = new int[s.length()];
        int index =0;
        for(int i = 1;i<ss.length;i++)
        {
            if(ss[i-1] == ss[i])
            {
                count ++;
            }
            else{
                count2[index++] = count;
                count = 1;
            }
        }
       count2[index++] = count;
        int result = 0;
        for(int i =0;i<count2.length-1;i++)
        {
           result += Math.min(count2[i],count2[i+1]);
        }
        return result;
    }
}
