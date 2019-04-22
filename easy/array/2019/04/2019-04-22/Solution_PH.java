class Solution { //Runtime: 0 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.
                 //Memory Usage: 35.9 MB, less than 96.77% of Java online submissions for Student Attendance Record I
    public boolean checkRecord(String s) {
        int k = s.length();
        int counta= 0;
        int countl=0;
        int i =0;
        for(;i<k;i++)
        {
            if(s.charAt(i)== 'A')
            {
              counta++; 
                countl=0;
            }
             if(s.charAt(i) == 'L')
             {
                 countl++;
             }
            else{
                countl=0;
            }
            if(counta>1 || countl>2)
            {
                break;
            }
        }
        if(i!=k)
        {
            return false;
        }
        else return true;
    }
}
