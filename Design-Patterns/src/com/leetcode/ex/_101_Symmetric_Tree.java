package com.leetcode.ex;

import com.leetcode.struct.TreeNode;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class _101_Symmetric_Tree {

    /**
     * Description:判断一棵二叉树是否对称
     * @author peixuan.xie
     * @time 2017/9/7 13:32
     * @param 
     * @return 
     */
    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return compare(left.left,right.right)&&compare(left.right,right.left);
    }

}
