class Solution {
    public boolean isPalindrome(String s) {
         int i = 0, j = s.length() - 1;
        s = s.toLowerCase(); //将字符串转化为小写
        char[] ch = s.toCharArray();
        while(i<j)
        {
            if(!(ch[i]>='0' && ch[i]<='9' || ch[i]>='a' && ch[i]<='z'))
            {
                i++;
                continue;
            }
             if(!(ch[j]>='0' && ch[j]<='9' || ch[j]>='a' && ch[j]<='z'))
            {
                j--;
                 continue;
            }
            
            if(ch[i]!=ch[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
