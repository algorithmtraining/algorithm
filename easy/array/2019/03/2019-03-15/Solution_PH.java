class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length -1;
        while(k > && digits[k] == 9)
        {
         digits[k] = 0;
          k -- ;
        }
        digits[k] = digits[k] +1 ;
        if(digits[k] == 10)
        {
        int [] temp = new int [digits.length+1]
        temp[0] = 1;
        temp[1]=0;
        for(int i =1;i<digits.length;i++)
        {
         temp[i+1] = digits[i];       
        }
        digits = temp;
       }
       return digits;
    }
}
