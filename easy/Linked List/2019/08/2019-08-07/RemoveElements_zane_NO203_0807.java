package LinkedList;

import java.util.HashSet;

/**
 * @program: zhaozhen197->RemoveElements_zane_NO203_0807
 * @description: 移除链表中固定值的节点
 * @author: zhaozhen
 * @create: 2019-09-12 10:01
 **/
public class RemoveElements_zane_NO203_0807 {


    public static void main(String[] args) {
        int[] as = {1};
        ListNode A = new ListNode(as[0]);
        ListNode headA = A;

        for (int i = 1; i < as.length; i++) {
            ListNode node = new ListNode(as[i]);
            A.next = node;
            node.next = null;
            A = A.next;
        }

        A = removeElements(headA, 1);
        while (A != null) {
            System.out.println(A.val);
            A = A.next;
        }


    }

    public static ListNode removeElements(ListNode head, int val) {



        ListNode dummyNode=new ListNode(val-1);
        dummyNode.next=head;
        ListNode pre =dummyNode;

        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }

        return dummyNode.next;
    }

    public static ListNode removeElements1(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        head.next = removeElements1(head.next, val);

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}
