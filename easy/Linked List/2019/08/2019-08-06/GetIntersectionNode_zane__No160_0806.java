package LinkedList;

import java.util.Stack;

/**
 * @program: zhaozhen197->GetIntersectionNode_zane__No160_0806
 * @description: 返回链表公共部分的第一个节点值
 * @author: zhaozhen
 * @create: 2019-09-10 11:36
 **/

public class GetIntersectionNode_zane__No160_0806 {

    public static void main(String[] args) {
        int[] as = {4, 1, 8, 4, 5};
        int[] bs = {5, 0, 1, 8, 4, 5};
        ListNode A = new ListNode(as[0]);
        ListNode B = new ListNode(bs[0]);
        ListNode headA = A;
        ListNode headB = B;

        for (int i = 1; i < as.length; i++) {
            ListNode node = new ListNode(as[i]);
            A.next = node;
            node.next = null;
            A = A.next;
        }

        for (int i = 1; i < bs.length; i++) {
            ListNode node = new ListNode(bs[i]);
            B.next = node;
            node.next = null;
            B = B.next;
        }

        ListNode temp = new GetIntersectionNode_zane__No160_0806().getIntersectionNode(headA,headB);
        System.out.println(temp.val);

    }

    /**
     * 利用栈先进后出的特性，从后遍历链表，如果两个
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode preNode = null;

        if (headA == null || headB == null) {
            return null;
        }
        ListNode A;
        ListNode B;
        Stack<ListNode> stackA = new Stack<>();
        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }

        Stack<ListNode> stackB = new Stack<>();
        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }

        while (!stackA.empty()&& !stackB.empty()&&(stackA.peek() == stackB.peek())) {
            A = stackA.pop();
            B = stackB.pop();
            preNode = A;


        }

        return preNode;
    }

    ListNode twoPointer(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != pointerB) {
            if (pointerA == null) {
                pointerA = headB;
            }else {
                pointerA = pointerA.next;
            }

            if (pointerB == null) {
                pointerB = headA;
            }else {
                pointerB = pointerB.next;
            }

        }

        return pointerA;
    }

}
