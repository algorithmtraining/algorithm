class Solution {
    public int toNum(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
     public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        int font = 0;
        int later = 0;
        int i = 0;
        for(;i<length-1;i++)
        {
            font = toNum(s.charAt(i));
            later = toNum(s.charAt(i+1));
            if(font >= later)
            {
                sum = sum + font;
               
            }
            else
            {
                sum = sum + later -font;
                i++;
            }
        }
        if (i==length-1)
        {
            sum =sum +toNum(s.charAt(i));
        }
        return sum;
    }
}
