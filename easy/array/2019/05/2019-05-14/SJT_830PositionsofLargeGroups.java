/*
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]


Note:  1 <= S.length <= 1000
 */
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        char[] s = S.toCharArray();
        char first = ' ';
        int firstIndex = -1 ,lastIndex = -1;
        for(int i=0; i<s.length; i++)
        {
            if(s[i]!=first)
            {
                if(lastIndex-firstIndex >=2)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(firstIndex);
                    list.add(lastIndex);
                    result.add(list);
                }
                first=s[i];
                firstIndex = i;
                lastIndex = i;
            }else{
                lastIndex = i;
                //到了最后了，不能等着下次更新；少此"aaa"测试未通过 ERR1
                if(i==s.length-1 && lastIndex-firstIndex >=2)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(firstIndex);
                    list.add(lastIndex);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Positions of Large Groups.
Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Positions of Large Groups.
 */