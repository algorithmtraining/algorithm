package com.jt.easy.array.d201903;
/*
class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        
        int i;
        for(i = digits.size()-1; i >= 0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i]++;
                return digits;
            }
            else
                digits[i]=0;
        }
        if(i < 0)
        {
            
            //if(digits.capacity() < digits.size()+1)
            //{
            //    digits.reserve(digits.size()+1);
            //}
            
            digits[0] = 1;
            
            //for(vector<int>::size_type ix = 1; ix != digits.size(); ix++)
            //{
                //cout << "ix" << ix;
            //    digits[ix] = 0;
            //}
            
            digits.push_back(0);
        }
        return digits;
    
    }
};
*/
public class SJT15_66PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits==null || digits.length==0)  return digits;
        int c = 0;//进位
        int len = digits.length;
        digits[len -1] += 1;
        for(int i=len -1; i>=0; i--)
        {
        	int s = digits[i] + c;
            if(s < 10)  return digits;
            else
            {
                digits[i] = s % 10;
                c = 1;
            }          
        }
        if(digits[0]==0)//有进位
        {
            int[] digits_jinwei = new int[len+1];
            digits_jinwei[0] = 1;
            for(int i=0; i<len; i++)
            {
                digits_jinwei[i+1] = digits[i];
            }
            return digits_jinwei;
        }
        return digits;
    }
    public static void main(String[] args)
	{
    	SJT15_66PlusOne plusOne = new SJT15_66PlusOne();
    	int[] a = new int[] {9,9};
    	System.out.println(plusOne.plusOne(a).toString());
	}
}
/*
题号 66
题目
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/