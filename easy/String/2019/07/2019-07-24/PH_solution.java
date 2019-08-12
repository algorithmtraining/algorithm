class Solution {//Runtime: 3 ms, faster than 76.61% of Java online submissions for Rotated Digits.
//Memory Usage: 32.8 MB, less than 41.67% of Java online submissions for Rotated Digits.
    public static boolean isgood(int n)
    {
        boolean result = false;
        while( n > 0 )
        {
            if(n%10 == 2 || n%10 == 5 || n%10 == 6 || n%10 ==9)
            {
                result = true;
            }
            if(n%10 == 4 || n%10 == 7 || n%10 == 3  )
            {
                return false;
            }
            n /= 10;
        }
        return result;
    }
    
    public int rotatedDigits(int N) {
        int count =0;
        for(int i =0;i<=N;i++)
        {
            
            if(isgood(i))
            {
                count ++;
            }
        }
        return count;
    }
}
