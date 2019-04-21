package com.jt.easy.array.d201903;

import java.util.ArrayList;
import java.util.List;

/*获取杨辉三角的某一行
Given a non-negative index k where k ≤ 33, 
return the kth index row of the Pascal's triangle.
Note that the row index starts from 0.

In Pascal's triangle, 
each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]
Follow up:
Could you optimize your algorithm to use only O(k) extra space?
*/
public class SJT20_119PascalsTriangle2
{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex<0) return list;
        for(int i=0; i<=rowIndex; i++)
        {
            list.add(0,1);//0的位置上插入1，其他数后移;即，1,上一行
            for(int j=1; j<i; j++)
            {
                list.set(j, list.get(j)+list.get(j+1));
            }
        }
        return list;
    }
	public static void main(String[] args)
	{
		SJT20_119PascalsTriangle2 triangle2 = 
				new SJT20_119PascalsTriangle2();
		
		System.out.println(triangle2.getRow(4));
	}
}
/*

*/