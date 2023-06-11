package com.grind.imp;
class Solution226 {
	
	
    public TreeNode invertTree(TreeNode root) {       
           if (root == null) {
            return null; // Base case: empty tree
        }

        // Invert the left and right subtrees recursively
        TreeNode invertedLeft = invertTree(root.left);
        TreeNode invertedRight = invertTree(root.right);

        // Swap the left and right subtrees
        root.left = invertedRight;
        root.right = invertedLeft;

        return root;
    }
    }
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
