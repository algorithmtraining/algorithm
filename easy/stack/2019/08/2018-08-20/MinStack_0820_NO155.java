package stack;

import java.util.Stack;

public class MinStack_0820_NO155 {


    private Stack<Integer> data;
    private Stack<Integer> helper;

    /**
     *使用一个辅助栈来进行操作，在入栈的时候，数据栈正常入栈，如果当前入栈元素小于等于辅助栈的栈顶元素或者辅助栈为空则辅助栈也正常入栈，
     * 否则将辅助栈的栈顶元素重新入栈一遍。在返回栈的最小元素的时候，即返回辅助栈的栈顶元素，这就是使用空间来换时间的特例
     */
    public MinStack_0820_NO155() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    void push(int x) {
        data.add(x);
        if (helper.isEmpty() || helper.peek() > x) {
            helper.add(x);

        }else {
            helper.add(helper.peek());
        }
    }

    void pop() {
        if (!data.isEmpty()) {
            helper.pop();
            data.pop();
        }
    }

    int top() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");

    }

    int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }
}
