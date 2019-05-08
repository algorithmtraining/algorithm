class Solution {  //Runtime: 0 ms, faster than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
                  //Memory Usage: 35.4 MB, less than 90.72% of Java online submissions for 1-bit and 2-bit Characters.               
    public boolean isOneBitCharacter(int[] bits) {
        int l = bits.length;
        int i = 0 ;
        while(i<bits.length-1)
        {
          if(bits[i] == 1)
          {
              i = i + 2;
          }
            else
            {
                 i = i+1;
            }         
        }
         
        if(i == bits.length-1 )
        {
            return true;
        }
        else return false;
    }
}
