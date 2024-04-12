package com.grind.imp;


//Revisit
//https://www.youtube.com/watch?v=PbPS460rbMo
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd,
                                     int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        
        int rootIndexInorder = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndexInorder = i;
                break;
            }
        }
        
        int leftSubtreeSize = rootIndexInorder - inStart;
        
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize,
                                    inorder, inStart, rootIndexInorder - 1);
        
        root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd,
                                     inorder, rootIndexInorder + 1, inEnd);
        
        return root;
    }
    
    public static void main(String[] args) {
        Solution105 Solution105 = new Solution105();
        
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        
        TreeNode root = Solution105.buildTree(preorder, inorder);
        
        // You can perform additional operations on the root of the constructed tree here.
    }
}
