class Solution { //Runtime: 10 ms, faster than 28.21% of Java online submissions for Find Common Characters.
       // Memory Usage: 38.6 MB, less than 52.44% of Java online submissions for Find Common Characters.               
    public List<String> commonChars(String[] A) {
         List<String > result =new ArrayList<String>();
        int count =1;
        for(int i =0;i<A[0].length();i++)
        {
            count =1;
            for(int j =1;j<A.length;j++)
            {
                if(A[j].indexOf(A[0].charAt(i))== -1)
                {
                    break;
                }
                else{
                    count ++;
                    A[j] = A[j].substring(0,A[j].indexOf(A[0].charAt(i))) + A[j].substring(A[j].indexOf(A[0].charAt(i))+1);
                }
            }
            if(count == A.length)
            {

                result.add(String.valueOf(A[0].charAt(i)));
            }
        }
        return result;             
    }
}
