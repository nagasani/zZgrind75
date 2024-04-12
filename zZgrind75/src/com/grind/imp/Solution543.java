package com.grind.imp;

//Revisit
class Solution543 
{
	public class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		
		TreeNode(int val) 
		{ 
			this.val = val; 
		}
		
		TreeNode(int val, TreeNode left, TreeNode right) 
		{
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	 int diameter = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return diameter;
    }

    // Helper function to calculate the depth (height) of a binary tree
    private int calculateDiameter(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = calculateDiameter(node.left);
        int rightDepth = calculateDiameter(node.right);

        // Update the diameter if the current path is longer
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current subtree (plus 1 to include the current node)
        return 1 + Math.max(leftDepth, rightDepth);
    }
}