class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
            String result ="";
            int first = 0;
            int last = 0;
            for(int i = 0;i<ch.length;i++ )
            {
                first = i;
                while(!Character.isSpace(ch[i]) && i<ch.length-1)
                {
                    i++;
                }
                if (!Character.isSpace(ch[ch.length-1]) && i==ch.length-1)
                {
                    last = i;
                }
                else {
                    last =i-1;
                }
                for(;last>=first;last--)
                {
                    result  = result+ch[last];
                }
               if(i == ch.length-1)
                {
                    return result;
                }
                else {
                    result = result + " ";
                }
            }
       return result; 
    }
}
