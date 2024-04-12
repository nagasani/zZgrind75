package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

class Solution872 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) 
	{
		List<Integer> lst1 = new ArrayList<>();
		getLeafNode(lst1, root1);
		
		List<Integer> lst2 = new ArrayList<>();
		getLeafNode(lst2, root2);
		
		System.out.println(lst1);
		System.out.println(lst2);
		
		return lst1.equals(lst2); 
	}
	
	public void getLeafNode(List<Integer> lst, TreeNode currentNode) 
	{
		if(currentNode == null) {
			return;
		}
		if(currentNode.right == null && currentNode.left == null) {
			int val = currentNode.val;
			lst.add(val);		
		}
		
		getLeafNode(lst, currentNode.left);
				
		getLeafNode(lst, currentNode.right);			
	}
}