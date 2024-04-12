package com.grind.imp;
class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both p and q are found in different subtrees, return the current root as LCA
        if (left != null && right != null) {
            return root;
        }

        // If either p or q is found in one of the subtrees, return that as LCA
        return (left != null) ? left : right;
    }
}