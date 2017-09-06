package com.leetcode.ex;

import com.leetcode.struct.TreeNode;

/**
 * Created by peixuan.xie on 2017/9/6.
 */
public class _108_Sorted_Array_to_BST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        TreeNode tree = buildTree(nums, 0, nums.length - 1);
        return tree;
    }

    public TreeNode buildTree(int[] num, int low, int high) {
        if (low > high)
            return null;
        int mid = (low + high) / 2;
        TreeNode treeNode = new TreeNode(num[mid]);
        treeNode.left = buildTree(num, low, mid - 1);
        treeNode.right = buildTree(num, mid + 1, high);
        return treeNode;
    }

}
