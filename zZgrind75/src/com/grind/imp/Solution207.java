package com.grind.imp;
import java.util.*;

//https://www.youtube.com/watch?v=EgI5nU9etnU
//Revisit
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an adjacency list to represent the graph.
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Populate the adjacency list.
        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);
        }
        
        // Initialize an array to keep track of visited nodes (0 = not visited, 1 = visiting, 2 = visited).
        int[] visited = new int[numCourses];
        
        // Perform DFS to check for cycles in the graph.
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && hasCycle(adjList, visited, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean hasCycle(List<List<Integer>> adjList, int[] visited, int course) {
        visited[course] = 1; // Mark as visiting
        
        for (int neighbor : adjList.get(course)) {
            if (visited[neighbor] == 1) {
                return true; // Cycle detected
            } else if (visited[neighbor] == 0 && hasCycle(adjList, visited, neighbor)) {
                return true; // Cycle detected in the neighbor's subtree
            }
        }
        
        visited[course] = 2; // Mark as visited
        return false;
    }
}
