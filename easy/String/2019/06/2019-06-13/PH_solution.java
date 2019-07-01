class Solution { //Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
                 //Memory Usage: 34.9 MB, less than 99.88% of Java online submissions for Detect Capital.            
    public boolean detectCapitalUse(String word) {
        char[] sh = word.toCharArray();
        int count =0;
        int count2 = 0;
        if(sh.length == 1)
        {
            return true;
        }
        for(int i = 0;i<sh.length;i++)
        {
            if(sh[i]>='a' && sh[i]<='z')
            {
                count ++;
                
            }
            if(sh[i]>='A' && sh[i]<='Z')
            {
                count2++;
            }
        }
        if(count == sh.length-1 && (sh[0]>='A' && sh[0]<='Z')  || count ==sh.length )
        {
            return true;
        }
        if(count2 == sh.length)
        {
            return true;
        }
        else return false;
      
    }
}
