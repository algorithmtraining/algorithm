class Solution {
   public static int[] toInteger(String a) {
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = Integer.parseInt(a.substring(i, i + 1));//substring是找出包含起始位置，不包含结束位置，到结束位置的前一位的子串
        }
        return arr;
    }
    public  List<Integer> addToArrayForm(int[] A, int K) {
        String kk = String.valueOf(K);
        int[] aa = toInteger(kk);
        List<Integer> result = new ArrayList<Integer>();
        int length1 = A.length;
        int length2 = aa.length;
        int i =length1-1,j=length2-1;
        int k =0;
        int sum =0;
        int insert = 0;
        while(i>=0 &&j>=0)
        {
             sum =  aa[j] + A[i] +k ;
             k  = sum/10;
             insert = sum %10;
            result.add(0,insert);
            i--;
            j--;

        }
        while(i>=0)
        {
            sum =   A[i] +k ;
            k  = sum/10;
            insert = sum %10;
            result.add(0,insert);
            i--;
        }
        while(j>=0)
        {
            sum =   aa[j] +k ;
            k  = sum/10;
            insert = sum %10;
            result.add(0,insert);
            j--;
        }
        if(k!=0 )
        {
            result.add(0,k);
        }
        return result;
    }

}
