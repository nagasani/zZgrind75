package com.grind.interviews;

//FreddieMac
class Solution235 
{
	TreeNode t = null;
	
	public class TreeNode 
	{
	    int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {       
        if(t == null && root != null && p != null && q != null && root.left != null && root.right != null 
        		&& ((root.left.val == p.val && root.right.val == q.val) 
        		|| (root.right.val == p.val && root.left.val == q.val)
        		|| (root.val == p.val && root.left.val == q.val)
        		|| (root.val == q.val && root.left.val == p.val)
        		|| (root.val == p.val && root.right.val == q.val)
        		|| (root.val == q.val && root.right.val == q.val)
        		|| (root.val == q.val && root.right.val == q.val)
        		)){
            t = root;  
            return t; 
        }
        if(t == null) {
        	if(root.left != null) {
        		lowestCommonAncestor(root.left, p, q);
        	}
        	if(root.right != null) {
        		lowestCommonAncestor(root.right, p, q);
        	}
        }
        return t;
    }
    
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new Solution235().new TreeNode(6);
        root.left = new Solution235().new TreeNode(2);
        root.right = new Solution235().new TreeNode(8);
        root.left.left = new Solution235().new TreeNode(0);
        root.left.right = new Solution235().new TreeNode(4);
        root.right.left = new Solution235().new TreeNode(7);
        root.right.right = new Solution235().new TreeNode(9);
        root.left.right.left = new Solution235().new TreeNode(3);
        root.left.right.right = new Solution235().new TreeNode(5);

        Solution235 solution = new Solution235();

        TreeNode p = new Solution235().new TreeNode(2);
        TreeNode q = new Solution235().new TreeNode(8);
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);  // Output: 6

        p = new Solution235().new TreeNode(2);
        q = new Solution235().new TreeNode(4);
        lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);  // Output: 2


        p = new Solution235().new TreeNode(2);
        q = new Solution235().new TreeNode(1);
        lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);  // Output: 2
    }
}