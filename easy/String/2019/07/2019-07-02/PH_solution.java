class Solution { // 利用辗转替换法。每次将长的字符串中第一个短字符出现的位置清0（借鉴）
                 //Runtime: 18 ms, faster than 11.48% of Java online submissions for Greatest Common Divisor of Strings.
//Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
               
    public String gcdOfStrings(String str1, String str2) {   
        int min = Math.min(str1.length(),str2.length());
        return gcd(str1,str2);
    }
    
     public String gcd(String str1, String str2){
        if(str1.equals(str2)){
            return str1;
        }
        if(!str1.contains(str2) && !str2.contains(str1)){
            return "";
        }
        if(str1.length() > str2.length()){
            str1 = str1.replaceFirst(str2,"");   
        }
        if(str2.length() > str1.length()){
            str2 = str2.replaceFirst(str1,"");
        }
        return gcd(str1,str2);
    }
}
