package stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack_NO225_0821_zane {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /**
     * 使用两个队列来模拟栈
     *队列queue1 ,queue2.
     * 压栈，queue1和queue2都为空的话，向queue1添加数据，若一个为空另一个不为空则向不为空的队列种压入数据
     * 出栈，将不为空的队列逐个出队，在另一个空队列种入队，保留队列的最后一个，然后返回这个队列最后一个数据，并出队列
     * 栈顶元素：将不为空的队列逐个出队，在另一个空队列种入队，保留队列的最后一个，然后返回这个队列最后一个数据，并出队列，入队
     * 是否栈空：如果两个队列都为空的话，则栈空。否则栈不空
     */
    public MyStack_NO225_0821_zane() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int size1 = queue1.size();
        int size2 = queue2.size();
        if (size1 > 0) {

            queue1.add(x);
        } else if (size2 > 0) {
            queue2.add(x);
        }else {
            queue1.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size1 = queue1.size();
        int size2 = queue2.size();
        int temp;
        if (queue1.isEmpty() && !queue2.isEmpty()) {
            for (int i = 0; i < size2 - 1; i++) {
                temp = queue2.poll();
                queue1.add(temp);
            }
            return queue2.poll();
        } else if (!queue1.isEmpty() && queue2.isEmpty()) {
            for (int i = 0; i < size1 - 1; i++) {
                temp = queue1.poll();
                queue2.add(temp);
            }
            return queue1.poll();
        }else {
            return -1;
        }
    }
    /** Get the top element. */
    public int top() {
        int size1 = queue1.size();
        int size2 = queue2.size();
        int temp;
        if (queue1.isEmpty() && !queue2.isEmpty()) {
            for (int i = 0; i < size2 - 1; i++) {
                temp = queue2.poll();
                queue1.add(temp);
            }
            temp = queue2.poll();
            queue1.add(temp);
            return temp;
        } else if (!queue1.isEmpty() && queue2.isEmpty()) {
            for (int i = 0; i < size1 - 1; i++) {
                temp = queue1.poll();
                queue2.add(temp);
            }
            temp =  queue1.poll();
            queue2.add(temp);
            return temp;
        }else {
            return -1;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }


}
