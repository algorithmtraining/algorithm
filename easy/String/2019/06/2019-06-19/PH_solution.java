class Solution {
  //Runtime: 3 ms, faster than 13.40% of Java online submissions for Add Binary.
  //Memory Usage: 36 MB, less than 91.64% of Java online submissions for Add Binary.
    public static int[] toInteger(String a) {      
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = Integer.parseInt(a.substring(i, i + 1));//substring是找出包含起始位置，不包含结束位置，到结束位置的前一位的子串
        }
      return arr;
    }

    public  String addBinary(String a, String b) {
        int[] a1 = toInteger(a);
        int[] b1 = toInteger(b);
        StringBuilder result = new StringBuilder();
        int k =0;
        int  i =a1.length-1,  j = b1.length-1;
        while(i>=0 && j>=0)
        {
            int sum =  a1[i] +b1[j] + k;
            k= sum/2;
            int insert = sum %2;
            result.insert( 0 , insert);
            i--;
            j--;
        }
        while(i>=0)
        {
            int sum =  a1[i]  + k;
            k= sum/2;
            int insert = sum %2;
            result.insert( 0 , insert);
            i--;
        }
        while(j>=0)
        {
            int sum =  b1[j]  + k;
            k= sum/2;
            int insert = sum %2;
            result.insert( 0 , insert);
            j--;
        }
        if(k == 1)
        {
            result.insert( 0 , 1);
        }
        String  s= result.toString();
        return s;
    }
}
