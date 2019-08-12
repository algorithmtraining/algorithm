class Solution {
    public String toLowerCase(String str) {
       char[] string = str.toCharArray();
        for(int i =0; i<str.length();i++)
        {
          if (string[i] <= 90 && string[i] >= 65) string[i] += 32;
        }
        return String.valueOf(string);
    }
}
