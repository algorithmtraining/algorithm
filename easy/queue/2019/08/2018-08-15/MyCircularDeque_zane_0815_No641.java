package queue;

/**
 * @program: zhaozhen197->MyCircularDeque
 * @description: 模拟双端队列
 * @author: zhaozhen
 * @create: 2019-09-18 09:34
 **/
public class MyCircularDeque_zane_0815_No641 {
    private int[] nums;
    //    容量
    private int capacity;
    private int prePointer;
    private int lastPointer;
    //    对队列中现存的元素个数
    private int length;

    /**
     * 使用循环数组来模拟双端队列
     *
     * @param k
     */
    public MyCircularDeque_zane_0815_No641(int k) {
        nums = new int[k];
        capacity = k;
        length = 0;
        prePointer = 0;
        lastPointer = 0;
    }

    /**
     * 注意：后端队对垒队列在插入元素时的指针的移动动，在前端队列删除元素时
     *
     * @param val
     * @return
     */
    public boolean insertLast(int val) {
        if (isFull()) {
            return false;
        }
        nums[lastPointer] = val;
        lastPointer = (lastPointer + 1) % capacity;
        length++;
        return true;
    }

    public boolean insertFront(int val) {

        if (isFull()) {
            return false;
        }
        /**
         * 注意:在前端插入时，如果前端队列没有元素，就向数组的最后一个位置插入元素
         */
        if (prePointer - 1 < 0) {
            prePointer = capacity - 1;
        } else {
            prePointer--;
        }
        nums[prePointer] = val;
        length++;
        return true;
    }


    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        prePointer = (prePointer + 1) % capacity;
        length--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (lastPointer - 1 < 0) {
            lastPointer = capacity - 1;

        } else {
            lastPointer--;
        }
        length--;
        return true;
    }


    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return nums[prePointer];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        if (lastPointer - 1 < 0) {
            return nums[capacity - 1];
        }
        return nums[(lastPointer - 1)];
    }


    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == capacity;
    }
}