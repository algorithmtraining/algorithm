class Solution {    //Runtime: 2 ms, faster than 61.37% of Java online submissions for Count and Say.
 //Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Count and Say.                  
    public String countAndSay(int n) {
       StringBuilder result = new StringBuilder("1");
        StringBuilder doublenumber = null;
        if (n == 1) {
            return result.toString();
        }
            for (int i = 1; i <n; i++) {
                doublenumber = new StringBuilder();
                for (int j = 0; j < result.length();) {
                    int number = 0;
                    char c = result.charAt(j);
                    while (j < result.length() && c == result.charAt(j)) {
                        j++;
                        number ++;
                    }
                    doublenumber.append(number).append(c);
                }
                result = doublenumber;
        }
        return result.toString();
}
}


// 方法二，递归算法,但是内存过限
public class countsay {
    public static String countAndSay(int n)
    {
        StringBuilder result = new StringBuilder();
        StringBuilder doublenumber  = new StringBuilder();
        if(n == 1)
        {
            result.append("1");
        }
        if(n == 2)
        {
           result.append("11");
        }
        else {
            int number =1;
            String before = countAndSay(n-1);
            char[]  beforechar = before.toCharArray();
            char c ;
            int i= 0;
            for (;i<beforechar.length-1;i++)
            {
                c = beforechar[i];
              if(beforechar[i+1] == beforechar[i])
              {
                  number ++;
              }
              else
              {
                  doublenumber.setLength(0);
                  doublenumber.insert(0,c);
                  doublenumber.insert(0,number);
                  result.append(doublenumber);
                  number = 1;
              }
            }
            c = beforechar[i];
            doublenumber.setLength(0);
            doublenumber.insert(0,c);
            doublenumber.insert(0,number);
            result.append(doublenumber);
        }
        return result.toString();
    }
