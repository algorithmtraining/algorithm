class Solution {        // 题目意思：如何两个字符串相等则返回-1；如何不相等就返回较长字符串的长度。 
                      
    public int findLUSlength(String a, String b) {
        if(a!=null && b!= null && !a.equals(b))
        {
            return a.length() > b.length() ? a.length() :  b.length();
        }
        else return -1;
    }
}
