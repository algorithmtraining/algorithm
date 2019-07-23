package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid_zane_0710_NO20 {
    public static void main(String[] args) {
        IsValid_zane_0710_NO20 isValid_zane_0710_no20 = new IsValid_zane_0710_NO20();
        String s = "([)]";
        boolean flag = isValid_zane_0710_no20.isValid2(s);
        System.out.println(flag);

    }
    public boolean isValid(String s) {

        Map<Character, Character> aMap = new HashMap<>();
        aMap.put('[', ']');
        aMap.put('{', '}');
        aMap.put('(', ')');

        int length = s.length();

        if (length % 2 == 1) {
            return false;
        }
        int begin = 0;
        int end = length - 1;
        int mid = begin + 1;

        while (end > begin) {
            char temp = s.charAt(begin);

            if (aMap.get(temp) == null) {
                return false;
            }

            if (s.charAt(end) == aMap.get(temp)){
                begin++;
                end--;
                mid++;
                continue;

            } else if (s.charAt(mid) == aMap.get(temp)) {
                begin += 2;
                mid += 2;
                continue;
            }

            if (aMap.get(end) != null || aMap.get(s.charAt(end - 1))==null) {
                return false;
            }
            if (aMap.get(s.charAt(end - 1)) == s.charAt(end)) {
                end -= 2;
            }else {
                return false;
            }
        }

        return true;
    }


    public boolean isValid1(String s) {

        while (s.contains("{}")||s.contains("[]")|| s.contains("()")){
            if(s.contains("{}")) s=s.replace("{}","");
            if(s.contains("()")) s=s.replace("()","");
            if(s.contains("[]")) s=s.replace("[]","");
        }

        return s.isEmpty();

    }

    /**
     *NO.20 使用栈来解决
     * 如果是左括号则进栈，如果是右括号就去查看栈顶元素是否是对应的左括号。如果不是则返回false.如果是就继续，直到栈为空时结束。
     * @param s
     * @return
     */
    public boolean isValid2(String s) {
        int length = s.length();

        if (length % 2 == 1) {
            return false;
        }

        Map<Character, Character> aMap = new HashMap<>();
        aMap.put('[', ']');
        aMap.put('{', '}');
        aMap.put('(', ')');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }else {
                if (stack.size() != 0  &&aMap.get(stack.peek()) == s.charAt(i)) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;

    }
}
