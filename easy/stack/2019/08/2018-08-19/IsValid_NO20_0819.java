package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid_NO20_0819 {

    public static void main(String[] args) {
        IsValid_NO20_0819 isValid_no20_0819 = new IsValid_NO20_0819();
        System.out.println(isValid_no20_0819.isValid("()[]{}"));
    }
    public boolean isValid(String s) {
        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put(')', '(');
        characterMap.put(']', '[');
        characterMap.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.containsKey(chars[i])) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != characterMap.get(chars[i])) {
                    return false;
                }
            }else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }
}
