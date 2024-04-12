package com.grind.imp;

//Revisit


public class Solution98 {
	
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new Solution98().new TreeNode(5);
        root.left = new Solution98().new TreeNode(3);
        root.right = new Solution98().new TreeNode(7);
        root.left.left = new Solution98().new TreeNode(2);
        root.left.right = new Solution98().new TreeNode(4);
        root.right.left = new Solution98().new TreeNode(6);
        root.right.right = new Solution98().new TreeNode(8);

        Solution98 solution = new Solution98();
        System.out.println(solution.isValidBST(root));  // Output: true
    }
}
