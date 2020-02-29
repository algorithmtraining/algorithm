import java.util.*;

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stackA = new Stack<Character>();
        Stack<Character> stackB = new Stack<Character>();

        for (int i = 0; i < S.length(); i++) {
            stackA.push(S.charAt(i));
        }

        while(!stackA.empty()) {
            if (stackB.empty()) {
                stackB.push(stackA.pop());
            }

            if(stackA.empty()){
                break;
            }

            if ( stackB.peek() == stackA.peek()) {
                stackA.pop();
                stackB.pop();
            } else {
                stackB.push(stackA.pop());

            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stackB.empty()) {
            sb.append(stackB.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.removeDuplicates("aaaaa");
        System.out.println(s);
    }
}