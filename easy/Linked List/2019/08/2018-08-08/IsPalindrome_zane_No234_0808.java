package LinkedList;

import java.util.Stack;

/**
 * @program: zhaozhen197->IsPalindrome_zane_No234_0807
 * @description: 判断链表是否为回文链表
 * @author: zhaozhen
 * @create: 2019-09-14 09:38
 **/
public class IsPalindrome_zane_No234_0808 {
    public static void main(String[] args) {
        int[] as = {1,1,2,1};
        ListNode A = new ListNode(as[0]);
        ListNode headA = A;

        for (int i = 1; i < as.length; i++) {
            ListNode node = new ListNode(as[i]);
            A.next = node;
            node.next = null;
            A = A.next;
        }
        boolean flag = new IsPalindrome_zane_No234_0808().isPalindrome(headA);
        System.out.println(flag);

    }

    /**
     * 使用栈结构，链表从头开始与栈顶元素进行比较，如果不同则返回false如果正常结束则返回true
     * 效率会有一点低
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
             node= node .next;
        }
        int i = 1;
        int len = stack.size() / 2;
        while (i <= len) {
            if (stack.pop().val != head.val) {
                return false;
            }
            head = head.next;
            i++;
        }
        return true;
    }

    /**
     * 双指针算法，效率较高。注意快慢指针得用法，以及链表得反转
     *
     * @param head
     * @return
     */
    public boolean twoPointer(ListNode head) {
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
//        如果是奇数个节点，去掉后半部分得第一个节点
        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;

        }
        return true;
    }

}
