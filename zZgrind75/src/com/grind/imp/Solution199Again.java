package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

//Revisit
class Solution199Again 
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
	     TreeNode root = new Solution199Again().new TreeNode(1);
	     root.left = new Solution199Again().new TreeNode(2);
	     root.right = new Solution199Again().new TreeNode(3);
	     root.left.right = new Solution199Again().new TreeNode(5);
	     root.right.right = new Solution199Again().new TreeNode(4);

	     Solution199Again solution = new Solution199Again();
	     //List<Integer> result = solution.rightSideView(root);
	     
	     printTree(root,"");

	     // Printing the result.
	     //System.out.println("Right Side View: " + result);
	 }
	 
	 public static void printTree1(TreeNode node) {
		 if(node != null) {
			 System.out.println(node.val);
			 printTree1(node.left);
			 printTree1(node.right);
		 }
		 {
			 return;
		 }		 
	 }
	 
	 private static void printTree(TreeNode node, String prefix) 
	 {		
		if(node == null)return;
		System.out.println(prefix+"+"+node.val);
		printTree(node.left, prefix+" ");
		printTree(node.right, prefix+" ");
	}	
}