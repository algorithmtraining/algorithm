/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
class Solution {
    /*
    Runtime: 536 ms, faster than 5.19% of Java online submissions for Implement strStr().
Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Implement strStr().
     */
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length()==0) return 0;
        if(haystack == null || haystack.length()==0 || needle.length()>haystack.length()) return -1;
        int i=0,j=0;
        int it;
        while(i<haystack.length()){
            it = i;
            while(it<haystack.length() && j<needle.length() && haystack.charAt(it) == needle.charAt(j)){
                it++;
                j++;
            }
            if(j==needle.length())
                return it-j;
            else{
                i++;
                j=0;
            }
        }
        return -1;
    }
    /*
Runtime: 539 ms, faster than 5.19% of Java online submissions for Implement strStr().
Memory Usage: 37.5 MB, less than 73.28% of Java online submissions for Implement strStr().
 */
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length()==0) return 0;
        if(haystack == null || haystack.length()==0 || needle.length()>haystack.length()) return -1;
        int i=0,j=0;
        int it;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                it = i+1;
                for(j=1;j<needle.length();){
                    if(it<haystack.length()&&haystack.charAt(it) == needle.charAt(j))
                    {
                        it++;
                        j++;
                    }else break;//err1 少此
                }
                if(j==needle.length())
                    return it-j;
                else{
                    i++;
                    j=0;
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}
