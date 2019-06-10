class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList();
        int fontindex=0;
        int lastindex = 0;
        int count =1;
        if (S.length() <= 0) {
            return result;
        }        
       char[] c=S.toCharArray();
        int i = 0;
        for(;i<S.length()-1;i++)
        {
             if (c[i+1] == c[i])     
            {
            count ++;

            }
               if(c[i+1] != c[i] && count >=3)
            {
                List<Integer> littleList = new ArrayList<>();
                fontindex = i-count+1;
                lastindex = i;  
                littleList.add(fontindex);
                littleList.add(lastindex);
                result.add(littleList);
               count =1;    
            }  
            if(c[i+1] != c[i] &&  count <3)
            {
                count = 1;
            }
          
        }
         if(i == S.length()-1 && count>=3){
               List<Integer> littleList = new ArrayList<>();
                fontindex = i-count+1;
                lastindex = i;  
                littleList.add(fontindex);
                littleList.add(lastindex);
                result.add(littleList);
           }
        return result;
    }
}
