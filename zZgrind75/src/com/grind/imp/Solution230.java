package com.grind.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Revisit
class Solution230 {
	
	private int count;
    private int result;

    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = 0;
        inorderTraversal(root, k);
        return result;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null)
            return;

        inorderTraversal(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inorderTraversal(node.right, k);
    }

    public int kthSmallest1(TreeNode root, int k) {
        List<Integer> lst = inorderTraversal1(root);
        Collections.sort(lst);
        return lst.get(k-1);
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }
    
}