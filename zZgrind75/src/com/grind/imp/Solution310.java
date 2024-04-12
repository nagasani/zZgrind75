package com.grind.imp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Revisit
public class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }
        
        // Create an adjacency list to represent the graph
        List<Set<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new HashSet<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adjList.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        
        while (n > 2) {
            List<Integer> newLeaves = new ArrayList<>();
            
            for (int leaf : leaves) {
                int neighbor = adjList.get(leaf).iterator().next();
                adjList.get(neighbor).remove(leaf);
                if (adjList.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            
            n -= leaves.size();
            leaves = newLeaves;
        }
        
        return leaves;
    }

    public static void main(String[] args) {
        Solution310 solution = new Solution310();
        int n = 6;
        int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
        List<Integer> result = solution.findMinHeightTrees(n, edges);
        System.out.println(result);  // Output: [3, 4]
    }
}
