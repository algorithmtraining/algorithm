class Solution {
 /**
 *双指针，一个指针从前，一个指针往后，如何两个指针所值字符相同，则分别向中心移动
 *当两指针所指字符不同时，分别删除i与j；再分别判断删除后的字符串是否为回文，如果其中有一个子字符串为回文，则返回true
 *Runtime: 12 ms, faster than 14.38% of Java online submissions for Valid Palindrome II.
  *Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Valid Palindrome II.
*算法缺陷，将部分字符比较两次，有待优化
 **/
    public static boolean isPalindrome(CharSequence s)
    {
        for ( int i =0,j=s.length()-1;i<j; i++,j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean validPalindrome(String s) {

        StringBuilder left = new StringBuilder(s);
        StringBuilder right = new StringBuilder(s);
        int i =0,j=s.length()-1;
        for ( ;i<j; i++,j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                if(isPalindrome(left.deleteCharAt(i)) || isPalindrome(right.deleteCharAt(j)))
                {
                    return true;
                }
                break ;
            }
        }
        if(i == j  || i-1 == j)
        {
            return true;
        }
        else return false;
    }
}
