package com.grind.misc;
import java.util.*;

import com.grind.misc.PrintTree.Node;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution199Practice 
{
    public List<Integer> rightSideView(TreeNode1 root) 
    {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode1 node = queue.poll();
                printNodeOfTree(node,"");
                if (i == size - 1) {
                    result.add(node.val); // Add the rightmost node value to the result.
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Creating the binary tree for testing.
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.right = new TreeNode1(5);
        root.right.right = new TreeNode1(4);
        
        printNodeOfTree(root,"");

        Solution199Practice solution = new Solution199Practice();
        List<Integer> result = solution.rightSideView(root);

        // Printing the result.
        System.out.println("Right Side View: " + result);
    }
    
    private static void printNodeOfTree(TreeNode1 node, String prefix) 
	 {		
		if(node == null)return;
		System.out.println(prefix+"+"+node.val);
		printNodeOfTree(node.left, prefix+" ");
		printNodeOfTree(node.right, prefix+" ");
	}	
}

