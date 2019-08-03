/*
You are given a string representing an attendance record for a student.
The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or
more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False
*/
class Solution {
	public boolean checkRecord(String s) {
		if(s == null || s.length() == 0) return false;
		int countA=0,countL=0;
		if(s.contains("LLL"))
			return false;
		for(int i=0 ; i<s.length(); i++)
		{
			if(s.charAt(i) == 'A')
				countA++;
			//if(s.charAt(i) == 'L')
			//countL++;
		}
		//if(countA>1 || countL>2)
		if(countA>1)
			return false;
		return true;
	}
}
/*
Runtime: 1 ms
Memory Usage: 36.6 MB
*/