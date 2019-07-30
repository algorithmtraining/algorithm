public class Solution { 
     //本题意为相加两个由数字组成的字符串和
//Runtime: 2 ms, faster than 95.24% of Java online submissions for Add Strings.
  //Memory Usage: 36.2 MB, less than 99.61% of Java online submissions for Add Strings.
              //用while循环超出内存大小，换用for循环测试通过         
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            result.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        if(carry != 0)
            result.append(carry);
        return sb.reverse().toString();
    }
}
