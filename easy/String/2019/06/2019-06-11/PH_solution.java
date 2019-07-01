class Solution {   //Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
              //Memory Usage: 33.9 MB, less than 99.63% of Java online submissions for Number of Segments in a String.           
    public int countSegments(String s) {
        char[] sh =s.toCharArray();
        if(sh.length == 0)
        {
            return 0;
        }
        int count =0;
        int flag = 0;
        int i =0;
        for(;i<sh.length;i++)
        {
            if(Character.isSpace(sh[i]) && flag == 1 )
            {
                count++;
                flag = 0;
            }
            if(!Character.isSpace(sh[i]))
            {
                flag =1;
            }
        }
        if(!Character.isSpace(sh[i-1]))
        {
            count++;
        }
        return count;
    }
}
