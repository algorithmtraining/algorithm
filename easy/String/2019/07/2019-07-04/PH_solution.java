class Solution { //Runtime: 1 ms, faster than 96.85% of Java online submissions for String Compression.
                //Memory Usage: 37 MB, less than 100.00% of Java online submissions for String Compression.
   public int compress(char[] chars) {
    int sum = 1, index = 0;
    for(int i =0;i<chars.length-1;i++)
    {
        if(chars[i+1] != chars[i] && sum >1)
        {
            chars[index++] = chars[i];
             for (char ch : (sum+"").toCharArray()) {
                chars[index++] = ch;
            }
            sum = 1;
        }
        else if(chars[i+1] != chars[i] && sum  == 1)
        {
            chars[index++] = chars[i];
        }
        else {
            sum++;
        }
    }
       chars[index++]  = chars[chars.length-1];
       if(sum >1)
       {
            for (char ch : (sum+"").toCharArray()) {
                chars[index++] = ch;
            }
       }
       return index;
}
}
