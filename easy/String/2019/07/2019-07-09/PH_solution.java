class Solution { //Runtime: 1 ms, faster than 73.96% of Java online submissions for Longest Common Prefix.
          // Memory Usage: 37.7 MB, less than 82.47% of Java online submissions for Longest Common Prefix.            
    public String longestCommonPrefix(String[] strs) {
        String s ="";
        if(strs.length <1)
        {
            return s;
        }
        if(strs.length == 1)
        {
            return strs[0];
        }
        int min = strs[0].length();
        for(int k =1;k<strs.length;k++)
        {
            min = Math.min(min,strs[k].length());
        }
        for(int i = 0;i<min;i++)
        {
            int j =1;
            char a = strs[0].charAt(i);
            while(j< strs.length)
            {
                if(strs[j].charAt(i) != a)
                {
                    break;
                }
                j++;
            }
            if(j==strs.length)
            {
                String next = Character.toString(a) ;
                s+=next;
            }
            else{
                break;
            }
        }
         return s;
    }
}
