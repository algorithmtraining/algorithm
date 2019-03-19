class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); //结果集
       
         if(numRows == 0)
         {
             return result;
         }
       List<Integer> arr1 = new ArrayList<>(); //第一行元素
        arr1.add(1);
        
        result.add(arr1);
        for(int i = 2;i< numRows+1;i++)   //从第二行开始循环
        { 
            List<Integer> temp = result.get(i-2);  //临时数组，存储上一行元素
          
            List<Integer> nowarr = new ArrayList<>();  //当前行元素
            for(int j =0;j < i ;j++)  //当前行元素的首个和最后一个均为1
            {
                if( j==0 || j == i-1 )
                {
                   nowarr.add(1);
                }
                else            
                {
                   nowarr.add(temp.get(j-1)+temp.get(j));
                }
                
            }
           
            result.add(nowarr);
                    
        }
        
        return result;
    }
}
