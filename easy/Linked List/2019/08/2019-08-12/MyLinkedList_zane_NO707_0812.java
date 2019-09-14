package LinkedList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.List;

/**
 * @program: zhaozhen197->MyLinkedList_zane_NO707_0812
 * @description: 自定义链表实现相关方法
 * @author: zhaozhen
 * @create: 2019-09-14 10:50
 * <p>
 * java.lang.NullPointerException
 * at line 88, MyLinkedList.addAtTail
 * at line 104, MyLinkedList.addAtIndex
 * at line 68, __Driver__.__helperSelectMethod__
 * at line 93, __Driver__.__helper__
 * at line 114, __Driver__.main
 **/
public class MyLinkedList_zane_NO707_0812 {

    public void printList() {
        Node node = head.next;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList_zane_NO707_0812 linkedList = new MyLinkedList_zane_NO707_0812();

        System.out.println("+++++++++");
        System.out.println(linkedList.get(0));            //返回3
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        linkedList.printList();
        System.out.println(linkedList.get(1));            //返回2
        System.out.println("=====");


        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        System.out.println(linkedList.get(1));            //返回2


    }

    private Node head;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList_zane_NO707_0812() {
        head = null;
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        Node no = getIndexNode(index);
        if (no == null) {
            return -1;
        }else{
            return no.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            head = new Node(val, head);
        }else {
            Node prenode = getIndexNode(index - 1);
            if (prenode == null) {
                return;
            }
            prenode.next = new Node(val, prenode.next);
        }
        size++;
    }

    public Node getIndexNode(int index) {
        if (!check(index)) {
            return null;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private boolean check(int index) {
        return !(index < 0 || index > (size - 1));
    }



    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (!check(index)) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }else {
            Node preNode = getIndexNode(index - 1);
            if (preNode == null) {
                return;
            }
            preNode.next = preNode.next.next;
        }
        size--;
    }

    private class Node {
        Integer val;

        Node next;

        Node() {
            val = null;
            next = null;
        }

        Node(int x) {
            val = x;
            next = null;
        }

        Node(int x,Node node) {
            val = x;
            next = node;
        }
    }

}

