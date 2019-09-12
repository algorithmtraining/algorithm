package LinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.TreeSet;

/**
 * @program: zhaozhen197->DeleteDuplicates_zane_NO83_0804
 * @description: 删除排序链表中的重复元素
 * @author: zhaozhen
 * @create: 2019-08-22 20:04
 **/
public class DeleteDuplicates_zane_NO83_0804 {
    /**
     * 解题思路：
     * 将链表中的内容放入TreeSet,再取出来
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        ListNode pointer = head;
        while (pointer != null) {
            treeSet.add(pointer.val);
            pointer = pointer.next;
        }

        pointer = head;
        ListNode pre = new ListNode(0);
        pre.next = pointer;
        for (Integer in : treeSet) {
            pointer.val = in;

            pointer = pointer.next;
            pre = pre.next;
        }
        pre.next = null;

        return head;
    }


    /**
     * 解题思路
     * @param head
     * @return
     */
    public ListNode deleteDuplicates1(ListNode head) {

        ListNode pointer = head;
        ListNode temp;
        while (pointer!=null && pointer.next != null) {
            if (pointer.val != pointer.next.val) {
                pointer = pointer.next;
            } else {
                temp = pointer;
                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }
                pointer.next = temp.next;
            }
        }


        return head;
    }
}
