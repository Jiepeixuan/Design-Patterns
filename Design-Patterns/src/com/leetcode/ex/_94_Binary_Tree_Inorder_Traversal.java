package com.leetcode.ex;

import com.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/11/3.
 */
public class _94_Binary_Tree_Inorder_Traversal {

    /**
     * @deprecated
     *          中序遍历二叉树
     * @param root
     * @return
     */

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }

        return res;
    }


}
