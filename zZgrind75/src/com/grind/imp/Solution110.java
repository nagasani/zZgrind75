package com.grind.imp;

class Solution110 
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
	
    public boolean isBalanced(TreeNode root) 
    {
    	int leftHeight  = getHeight(root.left);
    	int rightHeight = getHeight(root.left);
    	
    	if(Math.abs(leftHeight -rightHeight) > 1) {
    		return false;
    	}
    	  	
    	return isBalanced(root.left) && isBalanced(root.right);
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