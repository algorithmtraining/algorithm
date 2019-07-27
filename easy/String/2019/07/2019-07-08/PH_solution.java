class Solution {  // Runtime: 6 ms, faster than 80.47% of Java online submissions for Robot Return to Origin.
   //  Memory Usage: 36.4 MB, less than 99.88% of Java online submissions for Robot Return to Origin.
                
    public boolean judgeCircle(String moves) {
        int [] begin = {0,0};
        char[] move = moves.toCharArray();
        for(int i = 0;i<move.length;i++)
        {
            if(move[i] == 'U')
            {
                begin [1] = begin[1]+1;
            }
             if(move[i] == 'D')
            {
                begin [1] = begin[1]-1;
            }
             if(move[i] == 'R')
            {
                begin [0] = begin[0]+1;
            }
             if(move[i] == 'L')
            {
                begin [0] = begin[0]-1;
            }
        }
        if(begin[0]== 0 && begin[1] ==0)
        return true;
        else return false;
    }
}
