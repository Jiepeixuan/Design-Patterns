package com.leetcode.ex;


import com.leetcode.struct.TreeNode;

/**
 * Created by peixuan.xie on 2017/9/1.
 */
public class __104_Max_Depth_of_Tree {

    /**
     * @deprecated
     *              Given a binary tree, find its maximum depth.
     *
     *              对左右子树使用递归
     * @param root
     * @return
     */

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
