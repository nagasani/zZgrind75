package com.grind.imp;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//reVISIT
class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x) { val = x; }
}

public class Codec {

    // Serialize a binary tree to a string
    public String serialize(TreeNode1 root) {
        if (root == null) {
            return "null";
        }
        
        String left = serialize(root.left);
        String right = serialize(root.right);
        
        return root.val + "," + left + "," + right;
    }

    // Deserialize a string to a binary tree
    public TreeNode1 deserialize(String data) {
        String[] nodes = data.split(",");
        Queue<String> nodeQueue = new LinkedList<>(Arrays.asList(nodes));
        
        return deserializeHelper(nodeQueue);
    }
    
    private TreeNode1 deserializeHelper(Queue<String> nodeQueue) {
        String val = nodeQueue.poll();
        if (val.equals("null")) {
            return null;
        }
        
        TreeNode1 node = new TreeNode1(Integer.parseInt(val));
        node.left = deserializeHelper(nodeQueue);
        node.right = deserializeHelper(nodeQueue);
        
        return node;
    }
}
