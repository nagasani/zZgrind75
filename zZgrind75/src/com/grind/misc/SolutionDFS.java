package com.grind.misc;
import java.util.*;

class SolutionDFS 
{
    private boolean[] visited; // To keep track of visited nodes
    private List<List<Integer>> adjacencyList; // Adjacency list representation of the graph
    
    public void dfs(int startNode) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode); // Push the start node onto the stack

        while (!stack.isEmpty()) {
            int node = stack.pop(); // Pop the top node from the stack

            if (!visited[node]) {
                visited[node] = true; // Mark the current node as visited
                System.out.print(node + " "); // Process the current node

                // Traverse all the adjacent nodes in reverse order and push them onto the stack
                List<Integer> neighbors = adjacencyList.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public void dfsTraversal(int startNode, int n) {
        visited = new boolean[n]; // Initialize the visited array
        dfs(startNode); // Start the DFS traversal from the specified start node
    }

    public static void main(String[] args) {
        SolutionDFS solution = new SolutionDFS();
        
        // Example graph representation using adjacency lists
        solution.adjacencyList = new ArrayList<>();
        int n = 7; // Number of nodes
        
        // Initialize the adjacency list with empty lists for each node
        for (int i = 0; i < n; i++) {
            solution.adjacencyList.add(new ArrayList<>());
        }
        
        // Add edges to the graph
        solution.adjacencyList.get(0).add(1);
        solution.adjacencyList.get(0).add(2);
        solution.adjacencyList.get(1).add(3);
        solution.adjacencyList.get(1).add(4);
        solution.adjacencyList.get(2).add(5);
        solution.adjacencyList.get(2).add(6);
        
        int startNode = 0; // Starting node for DFS traversal
        solution.dfsTraversal(startNode, n);
    }
}
