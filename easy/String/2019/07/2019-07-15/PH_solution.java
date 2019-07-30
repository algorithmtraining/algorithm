//分别找到跟第一个字母相同字符的位置，判断这个距离是否是子字符串的长度，如果是，则返回true，如果不是，则距离加一后找第一个字母出现的下一位置

class Solution { // Runtime: 27 ms, faster than 49.62% of Java online submissions for Repeated Substring Pattern.
//Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Repeated Substring Pattern.
                 
   public static boolean isweigth(String s,int k)
    {
       if(s.length() <2)
       {
           return false;
       }
       int i =0;

        for(;i<s.length()-k;i++)
        {
            if(s.charAt(i) != s.charAt(i+k))
            {
                break;
            }
        }
        if(i+k==s.length() && s.length()%k ==0)
        {
            return true;
        }
        else return false;
    }
    public static boolean repeatedSubstringPattern(String s) {

        int weight =  1;
        char first = s.charAt(0);

        while(weight<=s.length()/2)
        {
            if(first != s.charAt(weight))
            {
                weight++;
            }
            else  if(isweigth(s,weight)){
                return true;
            }
            else{
                weight ++;
            }
        }
        if( weight >s.length()/2)
        {
            return false;
        }
        else return  true;
    }
}
