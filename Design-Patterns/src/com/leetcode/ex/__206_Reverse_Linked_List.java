package com.leetcode.ex;

import com.leetcode.struct.ListNode;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class __206_Reverse_Linked_List {

    /**
     * @param node
     * @return
     * @deprecated Reverse a singly linked list.
     */

    public ListNode reverseList(ListNode node) {

        ListNode preNode = node;
        ListNode CurNode = null;
        for (int i = 0; node != null; i++) {
            preNode = node.next;
            node.next = CurNode;
            CurNode = node;
            node = preNode;
        }

        return CurNode;
    }

}
