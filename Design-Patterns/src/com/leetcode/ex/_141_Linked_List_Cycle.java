package com.leetcode.ex;

import com.leetcode.struct.ListNode;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class _141_Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

}
