class Solution { //Runtime: 2 ms, faster than 79.42% of Java online submissions for Can Place Flowers.
                 //Memory Usage: 39.1 MB, less than 92.51% of Java online submissions for Can Place Flowers.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n >flowerbed.length)
        {
            return false;
        }
        for(int i=0;i<flowerbed.length;i++)
        {
             if(flowerbed[i] == 0 )
             {
                 if((i==0 ||  flowerbed[i-1] == 0 ) && (  i==flowerbed.length-1||flowerbed[i+1] == 0))
                 {
                     flowerbed[i]=1;
                     n--;          
                 }             
             }    
        }
        if(n <= 0)
        {
            return true;
        }
        else return false;
    }
}
