package com.jt.easy.array.d201903;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-negative integer numRows,
generate the first numRows of Pascal's triangle.
杨辉三角
In Pascal's triangle,
each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class SJT19_118PascalsTriangle
{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();//里面的list不用指出详细的类型 ，会报错
        if(numRows==0) return list;
        for(int i=0; i<numRows; i++)//生成每一行
        {
            List<Integer> rowList = new ArrayList<Integer>();
            for(int j=0; j<=i; j++)//每行的各个元素
            {
                if(j==0 || j==i)
                {
                    rowList.add(1);
                }else
                {
                    //rowList.add(list[i-1][j-1] + list[i-1][j]);
                    rowList.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                } 
            } 
            list.add(rowList);
        }
        return list;
    }
}
/*

*/