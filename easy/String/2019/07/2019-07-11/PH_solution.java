class Solution { //Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
 // Memory Usage: 47.9 MB, less than 91.06% of Java online submissions for Reverse String.               
    public void reverseString(char[] s) {
      if(s.length > 1)
      {
        int i =0,k = s.length-1;
        char temp =s[0];
        while(i<k)
        {
          temp =s[i];
          s[i] = s[k];
          s[k] = temp;
            i++;
            k--;
        }
    }
   }
}
