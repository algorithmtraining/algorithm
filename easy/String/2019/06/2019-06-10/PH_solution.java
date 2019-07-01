class Solution {
    private static boolean IsVowel(char c) {
        switch (c) {
            case 'a':
            case 'o':
            case 'e':
            case 'i':
            case 'u':
            case 'A':
            case 'O':
            case 'E':
            case 'I':
            case 'U':
                return true;
        }
        return false;
    }

    public  String reverseVowels(String s) {
        int length = s.length();
        char[] ss = s.toCharArray();
        int i = 0, j = length - 1;
        while (i < j) {
            if (!IsVowel(ss[i])) {
                i++;
            }
            if (!IsVowel(ss[j])) {
                j--;
            }
            if(IsVowel(ss[i]) && IsVowel(ss[j]))
            {
                char c = 'a';
                c = ss[i];
                ss[i] = ss[j];
                ss[j] = c;
                i++;
                j--;
            }
        }
        String str = new String(ss);
        return str;
    } 
}
