class Solution { //Runtime: 18 ms, faster than 41.89% of Java online submissions for Fair Candy Swap.
//Memory Usage: 40.6 MB, less than 93.62% of Java online submissions for Fair Candy Swap.
                 
    public static int [] findbalance (int[] Big,int[] Small,int x){
         int result[] = new int[2];
         Map<Integer,Integer> map = new HashMap<>();
         for(int i =0 ;i<Big.length;i++)
        {
            map.put(Big[i],i);
        }
        for(int j =0;j<Small.length;j++)
        {
            int k = x + Small[j];
            if(map.containsKey(k))
            {
                result[0] = Small[j];
                result[1] = k;
            }      
        }
        return result;
    }
    public int[] fairCandySwap(int[] A, int[] B) {
       int [] result =new int [2];
       int a =  A.length;
       int b = B.length;
       int suma = 0,sumb=0;
       for(int i=0;i<a;i++) 
       {
           suma+= A[i];
       }
        for(int j=0; j<b;j++)
        {
            sumb +=B[j];
        }
        int x = (Math.max(suma,sumb) - Math.min(suma,sumb))/2;
       
        if(suma>sumb)
        {
            result =  findbalance(A,B,x); 
            int temp =0;
            temp = result[1];
            result[1] = result[0];
            result[0] = temp;
            return result;
        }
        else return findbalance(B,A,x);
        
    }
}
