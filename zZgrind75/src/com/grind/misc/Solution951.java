package com.grind.misc;
 
class Solution951 {
	
	//Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        
        boolean flipped = (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
        boolean notFlipped = (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
        
        return flipped || notFlipped;
    }
}
