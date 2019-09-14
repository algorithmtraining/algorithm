package LinkedList;

/**
 * @program: zhaozhen197->DeleteNode_zane_NO237_0809
 * @description: 删除指定节点
 * @author: zhaozhen
 * @create: 2019-09-14 10:43
 **/
public class DeleteNode_zane_NO237_0809 {
    /**
     * 这个题目有点变态
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
