class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i<numbers.length ;i++)
        {
            map.put(numbers[i],i+1);
        }
        for(int j =0;j< numbers.length;j++)
        {
            
            int k = target - numbers[j];
            if( k >= numbers[j]  && map.containsKey(k) && map.get(k)!=j )
            {
                 return  new int[] {j+1,map.get(k)};
            }
        }
       throw new IllegalArgumentException("no two sum solution");
}
} 
