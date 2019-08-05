/*
Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.



Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]


Note:

1 <= A.length <= 100
1 <= A[i].length <= 100
A[i][j] is a lowercase letter
 */
class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] count = new int[26];
        int[] word = new int[26];
        for(int i=0; i<26; i++){
            count[i]=Integer.MAX_VALUE;
        }
        for(int i=0; i<A.length;i++){
            for(int w=0; w<26; w++){
                word[w]=0;
            }
            for(int j=0; j<A[i].length(); j++)
            {
                word[A[i].charAt(j) - 'a']++;
            }
            for(int w=0; w<26; w++){
                count[w] = Math.min(count[w],word[w]);
            }
        }
        for(int w=0; w<26; w++){
            for(int i=0; i<count[w];i++){
                list.add(String.valueOf((char)('a'+w)));
            }
        }
        return list;
    }
}
/*
Runtime: 3 ms, faster than 91.15% of Java online submissions for Find Common Characters.
Memory Usage: 36.6 MB, less than 99.28% of Java online submissions for Find Common Characters.
 */