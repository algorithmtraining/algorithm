package com.jt.easy.array.d201904;
/*
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
*/
public class SJT15_60CanPlaceFlowers
{
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int platedCount = 0;//种植的数量
        for(int i=0; i<len;i++)
        {
            if(flowerbed[i]==0)//有可能被种植地方
            {
                //其左右两边为1，不能种植
                if(i+1<len && flowerbed[i+1]==1)
                    continue;
                if(i-1>=0 && flowerbed[i-1]==1)
                    continue;
                //左右两边（若有邻近的位置）都是0
                flowerbed[i]=1;//种植
                platedCount++;
            }
            //i处种植的有花，判断i+2处是否能被种植
            i++;//之后又加1     
        }
        if(platedCount>=n)
            return true;
        return false;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Can Place Flowers.
Memory Usage: 40 MB, less than 82.89% of Java online submissions for Can Place Flowers.
*/