/**
*算法思想： 如果A中含有B或者A== B，则返回1
*A最多组合次数为A，B两字符串之间的差weighr，将A累计拼接weighr次，如果都不含有B，则返回-1；否则返回拼接次数+2(因为时从0倍开始，且初始就为1倍
*Runtime: 505 ms, faster than 5.06% of Java online submissions for Repeated String Match.
*Memory Usage: 37 MB, less than 100.00% of Java online submissions for Repeated String Match.
**/

class Solution {   
    public int repeatedStringMatch(String A, String B) {
        if(B.length() < A.length() && A.indexOf(B) >=0 || B.equals(A) )
        {
            return 1;
        }
       
        StringBuilder AA = new StringBuilder(A);
        int weighr = A.length()>B.length() ? A.length()- B.length() : B.length()-A.length();
        for(int i = 0 ; i<=weighr;i++)
        {
            AA.append(A);
            if(AA.indexOf(B) >=0)
            {
                return i+2;
            }
            
        }
        return -1;
    }
}
