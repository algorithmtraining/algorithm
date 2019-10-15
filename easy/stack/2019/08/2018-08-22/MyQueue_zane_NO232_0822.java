package stack;

import java.util.Stack;

/**
 * 使用双栈来进行队列的模拟。
 *
 * 要点: 每次都是对stack1进行压栈。
 * 出栈时，将stack1出栈stack2入栈，将stack1出栈的最后一个元素返回
 * 栈顶
 * @author zane
 */
public class MyQueue_zane_NO232_0822 {

    public static void main(String[] args) {
        MyQueue_zane_NO232_0822 myQueue_zane_no232_0822 = new MyQueue_zane_NO232_0822();
        myQueue_zane_no232_0822.push(1);
        myQueue_zane_no232_0822.push(2);
        System.out.println(myQueue_zane_no232_0822.peek());
        System.out.println(myQueue_zane_no232_0822.pop());
        System.out.println(myQueue_zane_no232_0822.empty());

    }


    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue_zane_NO232_0822() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        int size1 = stack1.size();
        int size2 = stack2.size();
        if (size1 > 0) {
            stack1.push(x);
        } else if (size2 > 0) {
            change(stack2, stack1, size2);
            stack1.push(x);
        } else {
            stack1.push(x);
        }
    }

    /**
     * 将stack01的元素出栈，装入stack02中
     * @param oldStack
     * @param newStack
     * @param size
     */
    public void change(Stack<Integer> oldStack, Stack<Integer> newStack, int size) {

        int temp;
        for (int i = 0; i < size; i++) {
            temp = oldStack.pop();
            newStack.push(temp);
        }
    }
    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int size1 = stack1.size();
        int temp;
        if (size1 > 0) {
            change(stack1, stack2, size1 - 1);
            temp = stack1.pop();
            change(stack2, stack1, stack2.size());
            return temp;
        } else {
            return -1;
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        int size1 = stack1.size();
        int temp;
        if (size1 > 0) {
            change(stack1, stack2, size1);
            temp = stack2.peek();
            change(stack2, stack1, size1);
            return temp;
        } else {
            return -1;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }
}
