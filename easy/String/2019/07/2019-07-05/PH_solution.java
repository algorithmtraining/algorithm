class Solution {
     public static   String  reversek(String s ,int k)
    {   //Runtime: 2 ms, faster than 24.59% of Java online submissions for Reverse String II.
       // Memory Usage: 37.8 MB, less than 39.75% of Java online submissions for Reverse String II.
        
        int p = k;
        char[] current = new char[k];
         
              for(int h = 0;h<p;h++)
             {
               current[--k] = s.charAt(h);
            }   
        String now = String.valueOf(current);
        String ks = s.substring(p);
        return now+ks;
    }
    public static String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
       String result ="";
        ArrayList<String> cc = new ArrayList<String>();
        int i =0;
        for(;i+2*k<=c.length;i=i+2*k)
        {
            cc.add(s.substring(i,i+2*k));
        }
        for (int j =0;j<cc.size();j++)
        {
            String now = reversek(cc.get(j),k);
            result = result+now;
        }
        if(i!=c.length && c.length-i<k)
        {
            String hhh =reversek(s.substring(i),c.length-i) ;
            result = result+hhh;
        }
        if(c.length-i>=k && c.length-i<2*k)
        {
            String kkk = reversek(s.substring(i),k) ;
            result = result+kkk;
        }
        return result;
    }
}
