class Solution {
    public int strStr(String haystack, String needle) {
    //Runtime: 1 ms, faster than 69.58% of Java online submissions for Implement strStr().
//Memory Usage: 37.7 MB, less than 68.73% of Java online submissions for Implement strStr().
       int  h = haystack.length();
       int  n = needle.length();
        if(n==0 )
        {
            return 0;
        ]
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int index =0;
        int i =0,j=0;
        int flag =0;
        while(i<h && j<n)
        {
            if(need[j] == hay[i])
            {
                j++;
                i++;
                flag =1;
            }
            else if(flag == 1){
                i= i-j+1;
                j=0;
            }
            else{
                i++;
            }
        }
        if(j == n)
        {
            return i-n;
        }
        else return -1;
    }
}
