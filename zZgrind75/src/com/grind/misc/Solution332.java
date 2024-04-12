package com.grind.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution332 {
    Map<String, List<String>> graph;
    List<String> result;

    public List<String> findItinerary(List<List<String>> tickets) {
        graph = new HashMap<>();
        result = new ArrayList<>();

        // Step 1: Build the graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
        }

        // Step 2: Sort the adjacency list
        for (List<String> neighbors : graph.values()) {
            Collections.sort(neighbors);
        }

        // Step 3: Start DFS from "JFK"
        dfs("JFK");

        // Step 4: Return the reconstructed itinerary (reverse the result list)
        Collections.reverse(result);
        return result;
    }

    private void dfs(String airport) {
        List<String> neighbors = graph.get(airport);
        while (neighbors != null && neighbors.size() > 0) {
            String nextAirport = neighbors.remove(0);
            dfs(nextAirport);
        }
        result.add(airport);
    }
}