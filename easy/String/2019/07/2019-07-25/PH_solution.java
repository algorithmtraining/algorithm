class Solution { //Runtime: 2 ms, faster than 75.81% of Java online submissions for Unique Morse Code Words.
//Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
    public String map(String c)
    {
        String result="";
        String s="";
        for( int i =0 ;i<c.length();i++)
        {
            switch (c.charAt(i))
        {
                case 'a': s =".-"; break;
                case 'b': s ="-..."; break;
                case 'c': s ="-.-."; break;
                case 'd': s ="-.."; break;
                case 'e': s ="."; break;
                case 'f': s ="..-."; break;
                case 'g': s ="--."; break;
                case 'h': s ="...."; break;
                case 'i': s =".."; break;
                case 'j': s =".---"; break;
                case 'k': s ="-.-"; break;
                case 'l': s =".-.."; break;
                case 'm': s ="--"; break;
                case 'n': s ="-."; break;
                case 'o': s ="---"; break;
                case 'p': s =".--."; break;
                case 'q': s ="--.-"; break;
                case 'r': s =".-."; break;
                case 's': s ="..."; break;
                case 't': s ="-"; break;
                case 'u': s ="..-"; break;
                case 'v': s ="...-"; break;
                case 'w': s =".--"; break;
                case 'x': s ="-..-"; break;
                case 'y': s ="-.--"; break;
                case 'z': s ="--.."; break;
                
        }
            result+=s;
        }
        
        return result;
    }
    
    public int uniqueMorseRepresentations(String[] words) {
        String [] result = new String[words.length];
        int count = words.length;
        for(int i= 0;i<words.length;i++)
        {
            result[i] = map(words[i]);
        }
        Map<String,Integer> hashmap = new HashMap<>();
        for(int j =0;j<result.length;j++)
        {
            if(hashmap.containsKey(result[j]))
            {
                count --;
                continue;
            }
            else{
                hashmap.put(result[j],j);
            }
        }
        return count;
    }
}
