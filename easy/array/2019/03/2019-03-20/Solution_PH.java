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
//仿照于姓大佬的写法
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
       int init = 1;
        int temp = init;
        for(int i =0;i <= rowIndex;i++ )
        {
            if(i==0)
            {
                arr.add(1);
            }
            for(int j =1;j<=i;j++)
            {
                if(j==i)
                {
                    arr.add(1);
                }
                else{
                    temp = arr.get(j);
                    arr.set(j, temp+init);
                    init = temp; 
                }
            }
        }
        return arr;
    }
}
