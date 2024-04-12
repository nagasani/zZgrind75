package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

//Revisit
class Solution199 
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
		
	List<Integer> lst = new ArrayList<>();
	public List<Integer> rightSideView(TreeNode root) 
	{		 
		if(root == null) 
		{
			return lst;
		}			
		lst.add(root.val);
		getHeights(1, root);
		//backTrack(root.right);
		return lst;
	}
	
	public int getHeights(int level, TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		int leftHeight = getHeights(level+1, node.left);
	    int rightHeight = getHeights(level+1, node.right);
		
	    return 1+Math.max(leftHeight, rightHeight);
	}
	
	 
	 public void backTrack(TreeNode node) 
	 {
	    if(node == null) 
	    {
	    	return;
	    }
	    else 
	    {
	    	lst.add(node.val);
	    }
	    backTrack(node.right);
	 }
	 
	 public static void main(String[] args) 
	 {
		 // Creating the binary tree for testing.
	     TreeNode root = new Solution199().new TreeNode(1);
	     root.left = new Solution199().new TreeNode(2);
	     root.right = new Solution199().new TreeNode(3);
	     root.left.right = new Solution199().new TreeNode(5);
	     root.right.right = new Solution199().new TreeNode(4);

	     Solution199 solution = new Solution199();
	     List<Integer> result = solution.rightSideView(root);

	     // Printing the result.
	     System.out.println("Right Side View: " + result);
	 }
}