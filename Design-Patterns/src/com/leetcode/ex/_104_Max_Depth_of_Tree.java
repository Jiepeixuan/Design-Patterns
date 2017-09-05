package com.leetcode.ex;


import com.leetcode.struct.TreeNode;

/**
 * Created by peixuan.xie on 2017/9/1.
 */
public class _104_Max_Depth_of_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
