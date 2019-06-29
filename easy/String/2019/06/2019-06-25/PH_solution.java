class Solution { //Runtime: 0 ms, faster than 100.00% of Java online submissions for Long Pressed Name.
                 //Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Long Pressed Name.
    public boolean isLongPressedName(String name, String typed) {
        char[] name1 = name.toCharArray();
        char[] typed1 = typed.toCharArray();
        if(name1[name1.length -1] != typed1[typed1.length-1] || name1[0] != typed1[0] )
        {
            return false;
        }
        int i =1,j=1;
        int flag = 0;
       while(i<name.length() && j<typed.length())
       {
           if(name1[i] == typed1[j])
           {
               i++;
               j++;
               continue;
           }
           if(name1[i] != typed1[j])
           {
               if(typed1[j] == name1[i-1])
               {
                   j++;
               }
               else {
                   return false;
               }
           }
          
       }
            return true;
      
    }
}
