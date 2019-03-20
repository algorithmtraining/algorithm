class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr1 = new ArrayList<>();   // 第一行
        List<Integer> temp = new ArrayList<>();   //保留当前行，为计算下一行做准备    
        if(rowIndex == 0)
        {
             arr1.add(1);
           temp = arr1;
            return arr1 ;
        }       
      
        for(int i = 1; i < rowIndex +2 ; i++)
        {  
            List<Integer> nowarr = new ArrayList<>(); //接收当前行元素
            
            for(int j = 0; j < i;j++)
            {
                if(j == 0 || j == i-1 ) 
                {
                    nowarr.add(1);
                }
                else
                {
                    nowarr.add (temp.get(j-1)+temp.get(j));
                }  
            }
            temp = nowarr ;            
        }
        return temp;
    }
}
