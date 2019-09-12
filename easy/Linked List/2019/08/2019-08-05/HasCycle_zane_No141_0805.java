package LinkedList;

import com.sun.org.apache.bcel.internal.generic.I2F;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: zhaozhen197->HasCycle_zane_No141_0805
 * @description: 判断循环链表
 * @author: zhaozhen
 * @create: 2019-08-24 22:17
 **/
public class HasCycle_zane_No141_0805 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (listNodes.contains(head)) {
                return true;
            }else {
                listNodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
