class Solution { // 效率太低下，注意后期改进
    public static int firstUniqChar(String s) {
      
        if(s.length() == 1)
        {
            return 0;
        }
        if(s.length() == 0)
        {
           return -1;
        }
        int count =1;
        int i =0;

        for(;i<s.length()-1;i++ )
        {
            char [] cc = s.toCharArray();
            if(cc[i] != '1')
            {
                 count =1;
                for(int j =i+1;j<cc.length;j++)
                {
                    if(cc[j] == cc[i])
                    {
                        count++;
                        s=s.replace(String.valueOf(cc[i]),"1");
                        break;
                    }
                }
                if(count == 1)
                {
                    return i;
            }
        }
        if(i == s.length()-1 && count== 1 || s.charAt(i) != '1' )
        {
            return i;
        }
        else return -1;
    }
}
