package com.grind.zip;

//Leetcode 104 Maximum Depth of binary Tree.
public class DFS 
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
	        
		return 8;
	}
	
	public int getHeight(TreeNode root) 
	{
		if(root == null) 
		{
			return 0;
		}
		int right = getHeight(root.left);
		int left = getHeight(root.right);		
		return 1+Math.max(right, left);		
	}
	
}
