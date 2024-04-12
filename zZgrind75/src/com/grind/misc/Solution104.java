package com.grind.misc;

class Solution104 
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
	
    public int maxDepth(TreeNode root) 
    {
    	return getHeight(root);
    }

	private int getHeight(TreeNode node) 
	{
		if(node == null) 
		{
			return 0;
		}
		
		int leftHeight = getHeight(node.left);
	    int rightHeight = getHeight(node.right);
		
	    return 1+Math.max(leftHeight, rightHeight);
	}
}