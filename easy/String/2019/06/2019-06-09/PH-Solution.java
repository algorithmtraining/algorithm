class Solution {
    public int lengthOfLastWord(String s) {
        char [] ch=s.toCharArray();
        int length = ch.length;
        int count = 0;
        for(int i = length-1 ;i>=0;i--)
        {
            if(Character.isSpace(ch[i])&& count != 0)
            {
                break;
            }
            
            else if(Character.isSpace(ch[i])&& count == 0)
            {
               continue;  
              }
            else  count++;
      }
          return count;
    }
}
