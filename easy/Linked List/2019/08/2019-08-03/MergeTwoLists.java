package LinkedList;

import java.util.List;

/**
 * @program: zhaozhen197->MergeTwoLists
 * @description: 合并链表
 * @author: zhaozhen
 * @create: 2019-08-22 13:56
 **/
public class MergeTwoLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pointer = null;
        pointer = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                pointer.next = l2;
                l2 = l2.next;
                pointer = pointer.next;
            }else {

                pointer.next = l1;
                l1 = l1.next;
                pointer = pointer.next;
            }

        }

        if (l1 == null) {
            pointer.next = l2;
        }else {
            pointer.next = l1;
        }


        return head.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }

    }

}
