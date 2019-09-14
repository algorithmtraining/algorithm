package LinkedList;

/**
 * @program: zhaozhen197->MiddleNode_zane_No876_0813
 * @description: 返回链表的中间节点
 * @author: zhaozhen
 * @create: 2019-09-14 14:02
 **/
public class MiddleNode_zane_No876_0813 {

    /**
     * 使用快慢指针，注意快慢指针的指针变化。
     * 快指针每次移动两步
     * 慢指针每次移动1步
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}
