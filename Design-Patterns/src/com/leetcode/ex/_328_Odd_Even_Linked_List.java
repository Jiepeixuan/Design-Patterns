package com.leetcode.ex;

import com.leetcode.struct.ListNode;

/**
 * Created by peixuan.xie on 2017/11/24.
 */
public class _328_Odd_Even_Linked_List {
    /**
     * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

     You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

     Example:
     Given 1->2->3->4->5->NULL,
     return 1->3->5->2->4->NULL.

     Note:
     The relative order inside both the even and odd groups should remain as it was in the input.
     The first node is considered odd, the second node even and so on ...

     给定一个list 将奇数和偶数区分开，给定list一定是奇数和偶数相间的
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {

        if (head == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
