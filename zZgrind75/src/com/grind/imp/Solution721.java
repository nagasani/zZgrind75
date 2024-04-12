package com.grind.imp;
import java.util.*;

//Revisit
class Solution721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> emailToName = new HashMap<>();
        Map<String, Set<String>> graph = new HashMap<>();

        // Build the graph and create email to name mapping
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                graph.computeIfAbsent(email, k -> new HashSet<>());
                if (i > 1) {
                    String prevEmail = account.get(i - 1);
                    graph.get(email).add(prevEmail);
                    graph.get(prevEmail).add(email);
                }
            }
        }

        Set<String> visited = new HashSet<>();
        List<List<String>> mergedAccounts = new ArrayList<>();

        // DFS to find connected components and merge accounts
        for (String email : emailToName.keySet()) {
            if (!visited.contains(email)) {
                List<String> connectedEmails = new ArrayList<>();
                dfs(email, graph, visited, connectedEmails);
                Collections.sort(connectedEmails);
                connectedEmails.add(0, emailToName.get(email));
                mergedAccounts.add(connectedEmails);
            }
        }

        return mergedAccounts;
    }

    private void dfs(String email, Map<String, Set<String>> graph, Set<String> visited, List<String> connectedEmails) {
        visited.add(email);
        connectedEmails.add(email);
        for (String neighbor : graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited, connectedEmails);
            }
        }
    }
}
