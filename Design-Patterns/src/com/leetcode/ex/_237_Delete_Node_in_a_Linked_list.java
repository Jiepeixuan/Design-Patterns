package com.leetcode.ex;

import com.leetcode.struct.ListNode;

/**
 * Created by peixuan.xie on 2017/9/5.
 */
public class _237_Delete_Node_in_a_Linked_list {

    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
